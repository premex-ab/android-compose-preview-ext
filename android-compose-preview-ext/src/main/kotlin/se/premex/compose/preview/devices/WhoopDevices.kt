package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * WHOOP device specifications for Android Compose previews.
 *
 * This extension provides WHOOP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Whoop.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Whoop: Any
  get() = object {
      /** WHOOP TAB-8US2 */
      val TAB_8US2 = "spec:width=800,height=1280,unit=px,dpi=220"

  }
