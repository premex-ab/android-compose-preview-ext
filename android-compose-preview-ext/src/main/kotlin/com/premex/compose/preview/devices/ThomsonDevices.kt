package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Thomson device specifications for Android Compose previews.
 *
 * This extension provides Thomson device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Thomson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Thomson: Any
  get() = object {
      /** Thomson EBL_5304G */
      val EBL_5304G = "spec:width=480,height=960,unit=px,dpi=240"

      /** Thomson guandu */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Thomson laoshan */
      val LAOSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Thomson LAS */
      val LAS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Thomson marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Thomson martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Thomson nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Thomson Origin_1010 */
      val ORIGIN_1010 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Thomson Origin_679 */
      val ORIGIN_679 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Thomson SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** Thomson TEOX102 */
      val TEOX102 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Thomson TEOX103 */
      val TEOX103 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Thomson YDA */
      val YDA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
