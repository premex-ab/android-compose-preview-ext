package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * e4u device specifications for Android Compose previews.
 *
 * This extension provides e4u device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.E4u.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.E4u: Any
  get() = object {
      /** e4u TAB900 */
      val TAB900 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
