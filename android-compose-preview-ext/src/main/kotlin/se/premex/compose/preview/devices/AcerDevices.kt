package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ACER device specifications for Android Compose previews.
 *
 * This extension provides ACER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Acer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Acer: Any
  get() = object {
      /** ACER Acer_A60L */
      val ACER_A60L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ACER AKMEI14 */
      val AKMEI14 = "spec:width=2160,height=3840,unit=px,dpi=420"

      /** ACER anglelake */
      val ANGLELAKE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ACER ARSP25MTA14A1 */
      val ARSP25MTA14A1 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** ACER AS10W */
      val AS10W = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** ACER AS8W */
      val AS8W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ACER chester */
      val CHESTER = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** ACER dahu */
      val DAHU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ACER R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ACER R10G */
      val R10G = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** ACER R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ACER R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ACER R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ACER R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ACER R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ACER vileparle */
      val VILEPARLE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ACER waiawa */
      val WAIAWA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
