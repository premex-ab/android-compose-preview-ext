package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TelecabPlay device specifications for Android Compose previews.
 *
 * This extension provides TelecabPlay device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telecabplay.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telecabplay: Any
  get() = object {
      /** TelecabPlay B866V2FA_TELECAB */
      val B866V2FA_TELECAB = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
