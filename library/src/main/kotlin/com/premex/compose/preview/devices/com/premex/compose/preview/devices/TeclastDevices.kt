package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Teclast device specifications for Android Compose previews.
 *
 * This extension provides Teclast device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Teclast.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Teclast: Any
  get() = object {
      /** DeviceSpec(manufacturer=Teclast, code=M20_4G, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M20_4G, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val M20_4G = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Teclast, code=M30_Pro_ROW, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M30_Pro_ROW,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val M30_PRO_ROW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Teclast, code=M40Air, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40Air, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val M40AIR = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Teclast, code=M40Plus_EEA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40Plus_EEA,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val M40PLUS_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Teclast, code=M40Plus_E_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40Plus_E_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val M40PLUS_E_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M40Plus_E_ROW, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40Plus_E_ROW,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val M40PLUS_E_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M40Plus_ROW, width=1200, height=1920, dpi=286,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40Plus_ROW,
      width=1200, height=1920, dpi=286, isGoogleDevice=false).code */
      val M40PLUS_ROW = "spec:width=1200,height=1920,unit=px,dpi=286"

      /** DeviceSpec(manufacturer=Teclast, code=M40Pro_A_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40Pro_A_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val M40PRO_A_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M40Pro_A_ROW, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40Pro_A_ROW,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val M40PRO_A_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M40Pro_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40Pro_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val M40PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M40Pro_ROW, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40Pro_ROW,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val M40PRO_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M40Pro_RUS, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40Pro_RUS,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val M40PRO_RUS = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Teclast, code=M40Pro_T, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40Pro_T, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val M40PRO_T = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M40SE, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40SE, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val M40SE = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Teclast, code=M40SE_Y_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40SE_Y_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val M40SE_Y_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M40SE_Y_ROW, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40SE_Y_ROW,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val M40SE_Y_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M40_Plus_EEA, width=1200, height=1920, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40_Plus_EEA,
      width=1200, height=1920, dpi=260, isGoogleDevice=false).code */
      val M40_PLUS_EEA = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Teclast, code=M40_Plus_ROW, width=1200, height=1920, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40_Plus_ROW,
      width=1200, height=1920, dpi=260, isGoogleDevice=false).code */
      val M40_PLUS_ROW = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Teclast, code=M40_Pro_2022_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40_Pro_2022_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val M40_PRO_2022_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M40_Pro_2022_ROW, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40_Pro_2022_ROW,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val M40_PRO_2022_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M40_Pro_2022_RUS, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M40_Pro_2022_RUS,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val M40_PRO_2022_RUS = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M50HD_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50HD_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val M50HD_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M50HD_ROW, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50HD_ROW,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val M50HD_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M50HD_T, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50HD_T, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val M50HD_T = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M50mini, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50mini, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val M50MINI = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=M50Mini_EEA, width=800, height=1340, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50Mini_EEA,
      width=800, height=1340, dpi=180, isGoogleDevice=false).code */
      val M50MINI_EEA = "spec:width=800,height=1340,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=M50Mini_ROW, width=800, height=1340, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50Mini_ROW,
      width=800, height=1340, dpi=180, isGoogleDevice=false).code */
      val M50MINI_ROW = "spec:width=800,height=1340,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=M50Mini_W_ROW, width=800, height=1340, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50Mini_W_ROW,
      width=800, height=1340, dpi=180, isGoogleDevice=false).code */
      val M50MINI_W_ROW = "spec:width=800,height=1340,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=M50Plus, width=1200, height=1920, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50Plus, width=1200,
      height=1920, dpi=260, isGoogleDevice=false).code */
      val M50PLUS = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Teclast, code=M50Plus_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50Plus_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val M50PLUS_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M50Plus_ROW, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50Plus_ROW,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val M50PLUS_ROW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Teclast, code=M50Pro_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50Pro_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val M50PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M50Pro_ROW, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50Pro_ROW,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val M50PRO_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=M50S_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50S_EEA, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val M50S_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=M50S_ROW, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50S_ROW, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val M50S_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=M50-EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50-EEA, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val M50_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=M50_EU, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50_EU, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val M50_EU = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=M50_ROW, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50_ROW, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val M50_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=M50-ROW, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50-ROW, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val M50_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=M50_T, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=M50_T, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val M50_T = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=P10SE_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P10SE_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P10SE_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Teclast, code=P10SE_ROW, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P10SE_ROW, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P10SE_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Teclast, code=P10S_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P10S_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P10S_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P10_HD_EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P10_HD_EEA,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val P10_HD_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Teclast, code=P10_HD_ROW, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P10_HD_ROW,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val P10_HD_ROW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Teclast, code=P20HD_EEA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P20HD_EEA,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val P20HD_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Teclast, code=P20HD_Pro_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P20HD_Pro_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val P20HD_PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=P20HD_ROW, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P20HD_ROW,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val P20HD_ROW = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Teclast, code=P20HD_RUS, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P20HD_RUS,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val P20HD_RUS = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Teclast, code=P20S_EEA, width=800, height=1280, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P20S_EEA, width=800,
      height=1280, dpi=186, isGoogleDevice=false).code */
      val P20S_EEA = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=Teclast, code=P20S_ROW, width=800, height=1280, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P20S_ROW, width=800,
      height=1280, dpi=186, isGoogleDevice=false).code */
      val P20S_ROW = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=Teclast, code=P20_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P20_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P20_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P25T_Y_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P25T_Y_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val P25T_Y_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P25T_Y_ROW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P25T_Y_ROW,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val P25T_Y_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P25_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P25_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P25_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Teclast, code=P25_ROW, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P25_ROW, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P25_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Teclast, code=P25_T, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P25_T, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P25_T = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Teclast, code=P26T, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P26T, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P26T = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Teclast, code=P30, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P30, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P30 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Teclast, code=P30Air, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P30Air, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P30AIR = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Teclast, code=P30Air_EEA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P30Air_EEA,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val P30AIR_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Teclast, code=P30Air_ROW, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P30Air_ROW,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val P30AIR_ROW = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Teclast, code=P30HD, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P30HD, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P30HD = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Teclast, code=P30S_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P30S_EEA, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val P30S_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=P30S_ROW, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P30S_ROW, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val P30S_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=P30S_W_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P30S_W_EEA,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val P30S_W_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=P30S_W_ROW, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P30S_W_ROW,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val P30S_W_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=P30T, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P30T, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P30T = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Teclast, code=P30T_B, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P30T_B, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P30T_B = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P30T_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P30T_EEA, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val P30T_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=P30T_ROW, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P30T_ROW, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val P30T_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=P30_B, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P30_B, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P30_B = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P30_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P30_EEA, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val P30_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=P30_ROW, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P30_ROW, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val P30_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=P40HD_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P40HD_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val P40HD_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=P40HD_ROW, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P40HD_ROW,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val P40HD_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=P40HD_T, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P40HD_T, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val P40HD_T = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=P40HD_T_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P40HD_T_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val P40HD_T_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=P40HD_T_ROW, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P40HD_T_ROW,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val P40HD_T_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=P50, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P50, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P50 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Teclast, code=P50Ai, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P50Ai, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P50AI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Teclast, code=P50Case, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P50Case, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P50CASE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P50Mini_ROW, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P50Mini_ROW,
      width=800, height=1340, dpi=213, isGoogleDevice=false).code */
      val P50MINI_ROW = "spec:width=800,height=1340,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P50S_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P50S_EEA, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val P50S_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=P50S_ROW, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P50S_ROW, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val P50S_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=P50_B_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P50_B_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P50_B_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P50_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P50_EEA, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val P50_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=P50_ROW, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P50_ROW, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val P50_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=P80, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P80, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P80 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P80h_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P80h_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P80H_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P80h_KR, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P80h_KR, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P80H_KR = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P80h_ROW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P80h_ROW, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P80H_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P80T, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P80T, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val P80T = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Teclast, code=P80T_Y_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P80T_Y_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val P80T_Y_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P80X, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P80X, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P80X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P80_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P80_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P80_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P80_G3M2_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P80_G3M2_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val P80_G3M2_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P80_G3M2_ROW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P80_G3M2_ROW,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val P80_G3M2_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P80_KOR, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P80_KOR, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P80_KOR = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P80_ROW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P80_ROW, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P80_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P85T, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P85T, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P85T = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Teclast, code=P85_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P85_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P85_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=P85_ROW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=P85_ROW, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P85_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Teclast, code=T30, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T30, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val T30 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Teclast, code=T40Air_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T40Air_EEA,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val T40AIR_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T40Air_ROW, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T40Air_ROW,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val T40AIR_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T40HD_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T40HD_EEA,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val T40HD_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T40HD_ROW, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T40HD_ROW,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val T40HD_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T40HD_T, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T40HD_T, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val T40HD_T = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T40Pro_2022_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T40Pro_2022_EEA,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val T40PRO_2022_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T40Pro_2022_ROW, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T40Pro_2022_ROW,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val T40PRO_2022_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T40Pro_A, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T40Pro_A, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val T40PRO_A = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T40Pro_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T40Pro_EEA,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val T40PRO_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T40Pro_ROW, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T40Pro_ROW,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val T40PRO_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T40Pro_T, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T40Pro_T, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val T40PRO_T = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T40_Plus_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T40_Plus_EEA,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val T40_PLUS_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T40_Plus_ROW, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T40_Plus_ROW,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val T40_PLUS_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T40_Pro_W_EEA, width=1200, height=2000, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T40_Pro_W_EEA,
      width=1200, height=2000, dpi=260, isGoogleDevice=false).code */
      val T40_PRO_W_EEA = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Teclast, code=T40_Pro_W_ROW, width=1200, height=2000, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T40_Pro_W_ROW,
      width=1200, height=2000, dpi=260, isGoogleDevice=false).code */
      val T40_PRO_W_ROW = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Teclast, code=T45HD_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T45HD_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val T45HD_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T45HD_ROW, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T45HD_ROW,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val T45HD_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T45HD_T, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T45HD_T, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val T45HD_T = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T50HD, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T50HD, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val T50HD = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T50HD_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T50HD_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val T50HD_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T50HD_ROW, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T50HD_ROW,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val T50HD_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T50Max_EEA, width=1200, height=1920, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T50Max_EEA,
      width=1200, height=1920, dpi=260, isGoogleDevice=false).code */
      val T50MAX_EEA = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Teclast, code=T50Max_ROW, width=1200, height=1920, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T50Max_ROW,
      width=1200, height=1920, dpi=260, isGoogleDevice=false).code */
      val T50MAX_ROW = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Teclast, code=T50Pro_W_EEA, width=1200, height=2000, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T50Pro_W_EEA,
      width=1200, height=2000, dpi=260, isGoogleDevice=false).code */
      val T50PRO_W_EEA = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Teclast, code=T50Pro_W_ROW, width=1200, height=2000, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T50Pro_W_ROW,
      width=1200, height=2000, dpi=260, isGoogleDevice=false).code */
      val T50PRO_W_ROW = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Teclast, code=T50_2022_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T50_2022_EEA,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val T50_2022_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T50_2022_ROW, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T50_2022_ROW,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val T50_2022_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T50_T, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T50_T, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val T50_T = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T50_Y_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T50_Y_EEA,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val T50_Y_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T50_Y_ROW, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T50_Y_ROW,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val T50_Y_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T60, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T60, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val T60 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T60Ai, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T60Ai, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val T60AI = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Teclast, code=T60Plus_EEA, width=1200, height=2000, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T60Plus_EEA,
      width=1200, height=2000, dpi=260, isGoogleDevice=false).code */
      val T60PLUS_EEA = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Teclast, code=T60Plus_ROW, width=1200, height=2000, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T60Plus_ROW,
      width=1200, height=2000, dpi=260, isGoogleDevice=false).code */
      val T60PLUS_ROW = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Teclast, code=T60_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T60_EEA, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val T60_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T60-EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T60-EEA, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val T60_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T60_ROW, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T60_ROW, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val T60_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T60-ROW, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T60-ROW, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val T60_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T65, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T65, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val T65 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Teclast, code=T65Max_EEA, width=1200, height=1920, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T65Max_EEA,
      width=1200, height=1920, dpi=260, isGoogleDevice=false).code */
      val T65MAX_EEA = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Teclast, code=T65Max_ROW, width=1200, height=1920, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T65Max_ROW,
      width=1200, height=1920, dpi=260, isGoogleDevice=false).code */
      val T65MAX_ROW = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Teclast, code=T70_ROW, width=1200, height=1920, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=T70_ROW, width=1200,
      height=1920, dpi=260, isGoogleDevice=false).code */
      val T70_ROW = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Teclast, code=Teclast_T40Pro, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=Teclast_T40Pro,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val TECLAST_T40PRO = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Teclast, code=Teclast_T40Pro_EA, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=Teclast_T40Pro_EA,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val TECLAST_T40PRO_EA = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Teclast, code=Teclast_T40Pro_RU, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=Teclast_T40Pro_RU,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val TECLAST_T40PRO_RU = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Teclast, code=Teclast_T50_EEA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=Teclast_T50_EEA,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val TECLAST_T50_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Teclast, code=Teclast_T50_ROW, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=Teclast_T50_ROW,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val TECLAST_T50_ROW = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Teclast, code=TLG01_EEA, width=1200, height=2000, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=TLG01_EEA,
      width=1200, height=2000, dpi=260, isGoogleDevice=false).code */
      val TLG01_EEA = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Teclast, code=TLG01_ROW, width=1200, height=2000, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=TLG01_ROW,
      width=1200, height=2000, dpi=260, isGoogleDevice=false).code */
      val TLG01_ROW = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Teclast, code=X_EEA, width=800, height=1280, dpi=204,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teclast, code=X_EEA, width=800,
      height=1280, dpi=204, isGoogleDevice=false).code */
      val X_EEA = "spec:width=800,height=1280,unit=px,dpi=204"

  }
