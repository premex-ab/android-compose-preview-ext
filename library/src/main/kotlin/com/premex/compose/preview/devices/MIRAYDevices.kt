package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MIRAY device specifications for Android Compose previews.
 *
 * This extension provides MIRAY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MIRAY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MIRAY: Any
  get() = object {
      /** MIRAY MIDM_F10 */
      val MIDM_F10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MIRAY R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MIRAY R10G */
      val R10G = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** MIRAY R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MIRAY R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MIRAY R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MIRAY R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MIRAY R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MIRAY TM4G_1006 */
      val TM4G_1006 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MIRAY TM4G_806 */
      val TM4G_806 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MIRAY TPM4G_105 */
      val TPM4G_105 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MIRAY TPM4G_E108 */
      val TPM4G_E108 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** MIRAY TPM4G_E108_A */
      val TPM4G_E108_A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MIRAY TPM4G_E9863 */
      val TPM4G_E9863 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MIRAY vileparle */
      val VILEPARLE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
