package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DENVER device specifications for Android Compose previews.
 *
 * This extension provides DENVER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Denver.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Denver: Any
  get() = object {
      /** DENVER SCQ-50001G */
      val SCQ_50001G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DENVER SDQ-55044L */
      val SDQ_55044L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DENVER SDQ-57004L */
      val SDQ_57004L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DENVER TAQ10 */
      val TAQ10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DENVER TAQ102 */
      val TAQ102 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DENVER TAQ70 */
      val TAQ70 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DENVER TAQ-104A */
      val TAQ_104A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DENVER TAQ_10G */
      val TAQ_10G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DENVER TAQ-703A */
      val TAQ_703A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DENVER TIQ102 */
      val TIQ102 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DENVER TIQ_1048 */
      val TIQ_1048 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
