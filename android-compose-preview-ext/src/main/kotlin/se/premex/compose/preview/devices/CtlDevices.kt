package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CTL device specifications for Android Compose previews.
 *
 * This extension provides CTL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ctl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ctl: Any
  get() = object {
      /** CTL ctl_iptv_mrvl */
      val CTL_IPTV_MRVL = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
