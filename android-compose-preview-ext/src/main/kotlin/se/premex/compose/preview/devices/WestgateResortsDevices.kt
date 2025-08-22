package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Westgate_Resorts device specifications for Android Compose previews.
 *
 * This extension provides Westgate_Resorts device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WestgateResorts.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WestgateResorts: Any
  get() = object {
      /** Westgate_Resorts T802 */
      val T802 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
