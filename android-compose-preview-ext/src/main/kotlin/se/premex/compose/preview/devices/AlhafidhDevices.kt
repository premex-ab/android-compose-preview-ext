package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ALHAFIDH device specifications for Android Compose previews.
 *
 * This extension provides ALHAFIDH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alhafidh.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alhafidh: Any
  get() = object {
      /** ALHAFIDH R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ALHAFIDH R10G */
      val R10G = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** ALHAFIDH R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ALHAFIDH R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ALHAFIDH R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ALHAFIDH R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ALHAFIDH R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ALHAFIDH tcl_eu */
      val TCL_EU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ALHAFIDH vileparle */
      val VILEPARLE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
