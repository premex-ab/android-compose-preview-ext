package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iBall device specifications for Android Compose previews.
 *
 * This extension provides iBall device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Iball.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Iball: Any
  get() = object {
      /** iBall Avid */
      val AVID = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iBall Blaze_V4 */
      val BLAZE_V4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** iBall Gorgeo_4GL */
      val GORGEO_4GL = "spec:width=600,height=1024,unit=px,dpi=160"

      /** iBall iBall_Slide_Brace_XJ */
      val IBALL_SLIDE_BRACE_XJ = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iBall iBall_Slide_Cleo_S9 */
      val IBALL_SLIDE_CLEO_S9 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** iBall iBall_Slide_Dazzle_i7 */
      val IBALL_SLIDE_DAZZLE_I7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** iBall Imprint_4G */
      val IMPRINT_4G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** iBall iT-KSA0003 */
      val IT_KSA0003 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** iBall iT-KSA0012 */
      val IT_KSA0012 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** iBall iT-KSA0066 */
      val IT_KSA0066 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** iBall Nova_4G */
      val NOVA_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iBall Perfect_10 */
      val PERFECT_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iBall Slide_Dazzle_3500 */
      val SLIDE_DAZZLE_3500 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** iBall Slide_Elan_3x32 */
      val SLIDE_ELAN_3X32 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iBall Slide_Elan_4G2_Plus */
      val SLIDE_ELAN_4G2_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iBall Slide_Majestic_01 */
      val SLIDE_MAJESTIC_01 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** iBall Slide_Nimble_4GF */
      val SLIDE_NIMBLE_4GF = "spec:width=800,height=1280,unit=px,dpi=213"

      /** iBall Slide_Skye_03 */
      val SLIDE_SKYE_03 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** iBall Slide_Wings_4GP */
      val SLIDE_WINGS_4GP = "spec:width=800,height=1280,unit=px,dpi=213"

      /** iBall Snap_4G2 */
      val SNAP_4G2 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** iBall Spirit_X2 */
      val SPIRIT_X2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** iBall Twinkle_i5 */
      val TWINKLE_I5 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
