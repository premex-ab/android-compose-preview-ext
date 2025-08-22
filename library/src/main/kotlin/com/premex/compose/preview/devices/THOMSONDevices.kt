package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * THOMSON device specifications for Android Compose previews.
 *
 * This extension provides THOMSON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.THOMSON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.THOMSON: Any
  get() = object {
      /** THOMSON Delight_TH201 */
      val DELIGHT_TH201 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** THOMSON Friendly_TH101 */
      val FRIENDLY_TH101 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** THOMSON ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** THOMSON L35_A */
      val L35_A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** THOMSON R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** THOMSON R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** THOMSON R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** THOMSON R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** THOMSON redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** THOMSON samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** THOMSON SNA */
      val SNA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** THOMSON TEO10 */
      val TEO10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** THOMSON TEO104G */
      val TEO104G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** THOMSON TEO10A2BK32P_EEA */
      val TEO10A2BK32P_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** THOMSON TEO10A4BK64P_EEA */
      val TEO10A4BK64P_EEA = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** THOMSON TEO10S */
      val TEO10S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** THOMSON TEO10-KID2BL32 */
      val TEO10_KID2BL32 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** THOMSON TEO13P */
      val TEO13P = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** THOMSON TEO84G332 */
      val TEO84G332 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** THOMSON TEO8M2BK32LTE */
      val TEO8M2BK32LTE = "spec:width=800,height=1280,unit=px,dpi=240"

      /** THOMSON TEOX10-MT8SL128LTE */
      val TEOX10_MT8SL128LTE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** THOMSON YXQ */
      val YXQ = "spec:width=720,height=1280,unit=px,dpi=320"

      /** THOMSON YZF */
      val YZF = "spec:width=720,height=1280,unit=px,dpi=320"

  }
