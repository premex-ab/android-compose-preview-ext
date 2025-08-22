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
      /** Teclast M20_4G */
      val M20_4G = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** Teclast M30_Pro_ROW */
      val M30_PRO_ROW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Teclast M40Air */
      val M40AIR = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Teclast M40Plus_EEA */
      val M40PLUS_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Teclast M40Plus_E_EEA */
      val M40PLUS_E_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M40Plus_E_ROW */
      val M40PLUS_E_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M40Plus_ROW */
      val M40PLUS_ROW = "spec:width=1200,height=1920,unit=px,dpi=286"

      /** Teclast M40Pro_A_EEA */
      val M40PRO_A_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M40Pro_A_ROW */
      val M40PRO_A_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M40Pro_EEA */
      val M40PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M40Pro_ROW */
      val M40PRO_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M40Pro_RUS */
      val M40PRO_RUS = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Teclast M40Pro_T */
      val M40PRO_T = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M40SE */
      val M40SE = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Teclast M40SE_Y_EEA */
      val M40SE_Y_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M40SE_Y_ROW */
      val M40SE_Y_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M40_Plus_EEA */
      val M40_PLUS_EEA = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** Teclast M40_Plus_ROW */
      val M40_PLUS_ROW = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** Teclast M40_Pro_2022_EEA */
      val M40_PRO_2022_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M40_Pro_2022_ROW */
      val M40_PRO_2022_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M40_Pro_2022_RUS */
      val M40_PRO_2022_RUS = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M50HD_EEA */
      val M50HD_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M50HD_ROW */
      val M50HD_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M50HD_T */
      val M50HD_T = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M50mini */
      val M50MINI = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast M50Mini_EEA */
      val M50MINI_EEA = "spec:width=800,height=1340,unit=px,dpi=180"

      /** Teclast M50Mini_ROW */
      val M50MINI_ROW = "spec:width=800,height=1340,unit=px,dpi=180"

      /** Teclast M50Mini_W_ROW */
      val M50MINI_W_ROW = "spec:width=800,height=1340,unit=px,dpi=180"

      /** Teclast M50Plus */
      val M50PLUS = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** Teclast M50Plus_EEA */
      val M50PLUS_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M50Plus_ROW */
      val M50PLUS_ROW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Teclast M50Pro_EEA */
      val M50PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M50Pro_ROW */
      val M50PRO_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast M50S_EEA */
      val M50S_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast M50S_ROW */
      val M50S_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast M50-EEA */
      val M50_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast M50_EU */
      val M50_EU = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast M50_ROW */
      val M50_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast M50_T */
      val M50_T = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast P10SE_EEA */
      val P10SE_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Teclast P10SE_ROW */
      val P10SE_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Teclast P10S_EEA */
      val P10S_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P10_HD_EEA */
      val P10_HD_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Teclast P10_HD_ROW */
      val P10_HD_ROW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Teclast P20HD_EEA */
      val P20HD_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Teclast P20HD_Pro_EEA */
      val P20HD_PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast P20HD_ROW */
      val P20HD_ROW = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Teclast P20HD_RUS */
      val P20HD_RUS = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Teclast P20S_EEA */
      val P20S_EEA = "spec:width=800,height=1280,unit=px,dpi=186"

      /** Teclast P20S_ROW */
      val P20S_ROW = "spec:width=800,height=1280,unit=px,dpi=186"

      /** Teclast P20_EEA */
      val P20_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P25T_Y_EEA */
      val P25T_Y_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P25T_Y_ROW */
      val P25T_Y_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P25_EEA */
      val P25_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Teclast P25_ROW */
      val P25_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Teclast P25_T */
      val P25_T = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Teclast P26T */
      val P26T = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Teclast P30 */
      val P30 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Teclast P30Air */
      val P30AIR = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Teclast P30Air_EEA */
      val P30AIR_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Teclast P30Air_ROW */
      val P30AIR_ROW = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Teclast P30HD */
      val P30HD = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Teclast P30S_EEA */
      val P30S_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast P30S_ROW */
      val P30S_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast P30S_W_EEA */
      val P30S_W_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast P30S_W_ROW */
      val P30S_W_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast P30T */
      val P30T = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Teclast P30T_B */
      val P30T_B = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P30T_EEA */
      val P30T_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast P30T_ROW */
      val P30T_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast P30_B */
      val P30_B = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P30_EEA */
      val P30_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast P30_ROW */
      val P30_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast P40HD_EEA */
      val P40HD_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast P40HD_ROW */
      val P40HD_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast P40HD_T */
      val P40HD_T = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast P40HD_T_EEA */
      val P40HD_T_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast P40HD_T_ROW */
      val P40HD_T_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast P50 */
      val P50 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Teclast P50Ai */
      val P50AI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Teclast P50Case */
      val P50CASE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P50Mini_ROW */
      val P50MINI_ROW = "spec:width=800,height=1340,unit=px,dpi=213"

      /** Teclast P50S_EEA */
      val P50S_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast P50S_ROW */
      val P50S_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast P50_B_EEA */
      val P50_B_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P50_EEA */
      val P50_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast P50_ROW */
      val P50_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast P80 */
      val P80 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P80h_EEA */
      val P80H_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P80h_KR */
      val P80H_KR = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P80h_ROW */
      val P80H_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P80T */
      val P80T = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Teclast P80T_Y_EEA */
      val P80T_Y_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P80X */
      val P80X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P80_EEA */
      val P80_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P80_G3M2_EEA */
      val P80_G3M2_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P80_G3M2_ROW */
      val P80_G3M2_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P80_KOR */
      val P80_KOR = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P80_ROW */
      val P80_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P85T */
      val P85T = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Teclast P85_EEA */
      val P85_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast P85_ROW */
      val P85_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Teclast T30 */
      val T30 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Teclast T40Air_EEA */
      val T40AIR_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T40Air_ROW */
      val T40AIR_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T40HD_EEA */
      val T40HD_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T40HD_ROW */
      val T40HD_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T40HD_T */
      val T40HD_T = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T40Pro_2022_EEA */
      val T40PRO_2022_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T40Pro_2022_ROW */
      val T40PRO_2022_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T40Pro_A */
      val T40PRO_A = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T40Pro_EEA */
      val T40PRO_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T40Pro_ROW */
      val T40PRO_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T40Pro_T */
      val T40PRO_T = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T40_Plus_EEA */
      val T40_PLUS_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T40_Plus_ROW */
      val T40_PLUS_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T40_Pro_W_EEA */
      val T40_PRO_W_EEA = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** Teclast T40_Pro_W_ROW */
      val T40_PRO_W_ROW = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** Teclast T45HD_EEA */
      val T45HD_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast T45HD_ROW */
      val T45HD_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast T45HD_T */
      val T45HD_T = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast T50HD */
      val T50HD = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast T50HD_EEA */
      val T50HD_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast T50HD_ROW */
      val T50HD_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast T50Max_EEA */
      val T50MAX_EEA = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** Teclast T50Max_ROW */
      val T50MAX_ROW = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** Teclast T50Pro_W_EEA */
      val T50PRO_W_EEA = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** Teclast T50Pro_W_ROW */
      val T50PRO_W_ROW = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** Teclast T50_2022_EEA */
      val T50_2022_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T50_2022_ROW */
      val T50_2022_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T50_T */
      val T50_T = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T50_Y_EEA */
      val T50_Y_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T50_Y_ROW */
      val T50_Y_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T60 */
      val T60 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T60Ai */
      val T60AI = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Teclast T60Plus_EEA */
      val T60PLUS_EEA = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** Teclast T60Plus_ROW */
      val T60PLUS_ROW = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** Teclast T60_EEA */
      val T60_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T60_ROW */
      val T60_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Teclast T65 */
      val T65 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Teclast T65Max_EEA */
      val T65MAX_EEA = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** Teclast T65Max_ROW */
      val T65MAX_ROW = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** Teclast T70_ROW */
      val T70_ROW = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** Teclast Teclast_T40Pro */
      val TECLAST_T40PRO = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Teclast Teclast_T40Pro_EA */
      val TECLAST_T40PRO_EA = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Teclast Teclast_T40Pro_RU */
      val TECLAST_T40PRO_RU = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Teclast Teclast_T50_EEA */
      val TECLAST_T50_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Teclast Teclast_T50_ROW */
      val TECLAST_T50_ROW = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Teclast TLG01_EEA */
      val TLG01_EEA = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** Teclast TLG01_ROW */
      val TLG01_ROW = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** Teclast X_EEA */
      val X_EEA = "spec:width=800,height=1280,unit=px,dpi=204"

  }
