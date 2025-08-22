package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Telenor device specifications for Android Compose previews.
 *
 * This extension provides Telenor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telenor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telenor: Any
  get() = object {
      /** Telenor b3680 */
      val B3680 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Telenor DV6113Z-KST */
      val DV6113Z_KST = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Telenor Hipernet_TV_Box_B866V2 */
      val HIPERNET_TV_BOX_B866V2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Telenor i6379 */
      val I6379 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Telenor MediaBox_B866V2 */
      val MEDIABOX_B866V2 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
