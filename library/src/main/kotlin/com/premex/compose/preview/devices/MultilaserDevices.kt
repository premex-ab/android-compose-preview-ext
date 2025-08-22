package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Multilaser device specifications for Android Compose previews.
 *
 * This extension provides Multilaser device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Multilaser.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Multilaser: Any
  get() = object {
      /** Multilaser astar-ococci */
      val ASTAR_OCOCCI = "spec:width=480,height=800,unit=px,dpi=120"

      /** Multilaser DI01_M7_WIFI */
      val DI01_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser M10A */
      val M10A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser M10A_3G */
      val M10A_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser M10A-Lite */
      val M10A_LITE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Multilaser M7SQC_Plus */
      val M7SQC_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser M9-3G */
      val M9_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser M9-3G_2 */
      val M9_3G_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser MLX8 */
      val MLX8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Multilaser MLX8_4G */
      val MLX8_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML-CH-MS45_4G */
      val ML_CH_MS45_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** Multilaser ML_GW0C_M10_4G */
      val ML_GW0C_M10_4G = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Multilaser ML-JI03-M10-4G */
      val ML_JI03_M10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML-JI04-M7-4G */
      val ML_JI04_M7_4G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-JI05-M9-3G */
      val ML_JI05_M9_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-JI06-M10-3G */
      val ML_JI06_M10_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML-JI07-M7S-LITE */
      val ML_JI07_M7S_LITE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-JI08-M7S-PLUS */
      val ML_JI08_M7S_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-JI09-M9S-GO */
      val ML_JI09_M9S_GO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-JI0A-M10-4G */
      val ML_JI0A_M10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_JI0B_M10_4G */
      val ML_JI0B_M10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_JI0C_M10_4G_AC */
      val ML_JI0C_M10_4G_AC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_JI0D_M7_WIFI */
      val ML_JI0D_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_JI0E_M9_WIFI */
      val ML_JI0E_M9_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_JI0F_M10_4G_PRO */
      val ML_JI0F_M10_4G_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML-JI0G-M7-3G-PLUS */
      val ML_JI0G_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_JI0H_M10_3G */
      val ML_JI0H_M10_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_JI0I_M8_4G */
      val ML_JI0I_M8_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Multilaser ML_JI0L_M10_4G */
      val ML_JI0L_M10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_JI0M_M10_4G */
      val ML_JI0M_M10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_JI0N_M7_3G */
      val ML_JI0N_M7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_JI0O_M7_WIFI */
      val ML_JI0O_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_JI0S_M7_WIFI */
      val ML_JI0S_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_JI0T_M9_WIFI */
      val ML_JI0T_M9_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_JI0U_M9_WIFI */
      val ML_JI0U_M9_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-JI11-M7_3G_PLUS */
      val ML_JI11_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-JI16-M10-3G */
      val ML_JI16_M10_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_JI1D_M7_WIFI */
      val ML_JI1D_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_JI1G_M7_3G */
      val ML_JI1G_M7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-JI21-M7-3G-PLUS */
      val ML_JI21_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-JI22-M7SQC_Plus */
      val ML_JI22_M7SQC_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_JI2D_M7_WIFI */
      val ML_JI2D_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_JI2G_M7_3G */
      val ML_JI2G_M7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_JI3D_M7_WIFI */
      val ML_JI3D_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-JI-M7_3G_PLUS */
      val ML_JI_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-SO06-M7sLite */
      val ML_SO06_M7SLITE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-SO06-M7S-LITE-KIDPAD */
      val ML_SO06_M7S_LITE_KIDPAD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-SO07-M7S-PLUS */
      val ML_SO07_M7S_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_SO08_M9_Wifi */
      val ML_SO08_M9_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_SO09_MLX8_4G */
      val ML_SO09_MLX8_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_SO0A_M10A_Lite */
      val ML_SO0A_M10A_LITE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_SO0B_M10_3G */
      val ML_SO0B_M10_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Multilaser ML-SO0C_M10_4G_PRO_PLUS */
      val ML_SO0C_M10_4G_PRO_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_SO0C_ULTRA_10 */
      val ML_SO0C_ULTRA_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_SO0E_M7_WIFI */
      val ML_SO0E_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_SO0F_M8_WIFI */
      val ML_SO0F_M8_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Multilaser ML_SO0G_M10_4G */
      val ML_SO0G_M10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_SO0G_M10_4G_PRO_PLUS */
      val ML_SO0G_M10_4G_PRO_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_SO0J_M8_4G */
      val ML_SO0J_M8_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Multilaser ML_SO0K_M10_4G_T3 */
      val ML_SO0K_M10_4G_T3 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_SO0K_U10_MTK */
      val ML_SO0K_U10_MTK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_SO0P_M7_WIFI */
      val ML_SO0P_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_SO0Q_M10_3G */
      val ML_SO0Q_M10_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_SO0R_M7_WIFI */
      val ML_SO0R_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_SO0S_M7_WIFI */
      val ML_SO0S_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_SO0T_M8_WIFI */
      val ML_SO0T_M8_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Multilaser ML_SO0U_M10_WIFI */
      val ML_SO0U_M10_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Multilaser ML_SO0V_M8_4G */
      val ML_SO0V_M8_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Multilaser ML_SO0W_M9_WIFI */
      val ML_SO0W_M9_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_SO19_M8_4G */
      val ML_SO19_M8_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_SO1E_M7_Wifi */
      val ML_SO1E_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_SO1G_M10_4G_PRO */
      val ML_SO1G_M10_4G_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_SO1J_M8_4G */
      val ML_SO1J_M8_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Multilaser ML_SO1S_M7_WIFI */
      val ML_SO1S_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_SO1U_M10_WIFI */
      val ML_SO1U_M10_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_SO2E_M7_WIFI */
      val ML_SO2E_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_SO5C_M10_4G_T1 */
      val ML_SO5C_M10_4G_T1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML-SO-M7_3G_PLUS */
      val ML_SO_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-SO-M9-3G */
      val ML_SO_M9_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-TI0A-MS60X */
      val ML_TI0A_MS60X = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Multilaser ML-TI0B-MS60Z */
      val ML_TI0B_MS60Z = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Multilaser ML-TI0C-MS60X */
      val ML_TI0C_MS60X = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Multilaser ML-TI0D-MS80X */
      val ML_TI0D_MS80X = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** Multilaser ML-TI-MS40G */
      val ML_TI_MS40G = "spec:width=480,height=800,unit=px,dpi=240"

      /** Multilaser ML-TI-MS50G */
      val ML_TI_MS50G = "spec:width=480,height=960,unit=px,dpi=240"

      /** Multilaser ML-TI-MS50X */
      val ML_TI_MS50X = "spec:width=480,height=960,unit=px,dpi=240"

      /** Multilaser ML-TI-MS80 */
      val ML_TI_MS80 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Multilaser ML_WI0A_M7_3G_PLUS */
      val ML_WI0A_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_WI0B_M7_3G */
      val ML_WI0B_M7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-WI0C-M10-4G */
      val ML_WI0C_M10_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Multilaser ML-WI0G-M8-4G */
      val ML_WI0G_M8_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Multilaser ML_WI12_M7_3G_PLUS */
      val ML_WI12_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-WI16-M9_3G */
      val ML_WI16_M9_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_WI1A_M7_3G_A10 */
      val ML_WI1A_M7_3G_A10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-WI1B-M7-3G */
      val ML_WI1B_M7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-WI1C-M10-4G-T3 */
      val ML_WI1C_M10_4G_T3 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Multilaser ML-WI23-MLX8 */
      val ML_WI23_MLX8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Multilaser ML_WI2A_M7_3G_A10 */
      val ML_WI2A_M7_3G_A10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_WI3A_M7_3G_A10 */
      val ML_WI3A_M7_3G_A10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML_WI4A_M7_3G_A10 */
      val ML_WI4A_M7_3G_A10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-WI-M7_3G_PLUS */
      val ML_WI_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser ML-WI-M9-3G */
      val ML_WI_M9_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Multilaser MS40S */
      val MS40S = "spec:width=480,height=800,unit=px,dpi=213"

      /** Multilaser MS45S_A6 */
      val MS45S_A6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Multilaser MS50L */
      val MS50L = "spec:width=480,height=854,unit=px,dpi=240"

      /** Multilaser MS50L_4G */
      val MS50L_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** Multilaser MS50S */
      val MS50S = "spec:width=480,height=854,unit=px,dpi=240"

      /** Multilaser MS55M */
      val MS55M = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Multilaser MS60 */
      val MS60 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Multilaser MS60F */
      val MS60F = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Multilaser MS60F_PLUS */
      val MS60F_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Multilaser Multilaser_E */
      val MULTILASER_E = "spec:width=480,height=854,unit=px,dpi=240"

      /** Multilaser Multilaser_E_2 */
      val MULTILASER_E_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Multilaser Multilaser_E_Lite */
      val MULTILASER_E_LITE = "spec:width=480,height=800,unit=px,dpi=240"

      /** Multilaser Multilaser_E_Pro */
      val MULTILASER_E_PRO = "spec:width=480,height=854,unit=px,dpi=200"

      /** Multilaser Multilaser_F */
      val MULTILASER_F = "spec:width=480,height=960,unit=px,dpi=240"

      /** Multilaser Multilaser_F2 */
      val MULTILASER_F2 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Multilaser Multilaser_F_Max_2 */
      val MULTILASER_F_MAX_2 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Multilaser Multilaser_F_Pro */
      val MULTILASER_F_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** Multilaser Multilaser_F_Pro_2 */
      val MULTILASER_F_PRO_2 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Multilaser Multilaser_G */
      val MULTILASER_G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Multilaser Multilaser_GMax_2_128 */
      val MULTILASER_GMAX_2_128 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Multilaser Multilaser_GMAX_2_64 */
      val MULTILASER_GMAX_2_64 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Multilaser Multilaser_GPRO2 */
      val MULTILASER_GPRO2 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Multilaser Multilaser_G_2 */
      val MULTILASER_G_2 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** Multilaser Multilaser_G_3 */
      val MULTILASER_G_3 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Multilaser Multilaser_G_Max */
      val MULTILASER_G_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Multilaser Multilaser_G_Max_2_SE_64 */
      val MULTILASER_G_MAX_2_SE_64 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Multilaser Multilaser_G_Pro */
      val MULTILASER_G_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Multilaser Multilaser_G_Pro_3S */
      val MULTILASER_G_PRO_3S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Multilaser Multilaser_H */
      val MULTILASER_H = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Multilaser Multilaser_H_5G */
      val MULTILASER_H_5G = "spec:width=1080,height=2400,unit=px,dpi=445"

      /** Multilaser OBASMART_3 */
      val OBASMART_3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Multilaser Obasmart_Conectamax */
      val OBASMART_CONECTAMAX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Multilaser Oba_Conecta_4G */
      val OBA_CONECTA_4G = "spec:width=480,height=960,unit=px,dpi=200"

      /** Multilaser WI0C_M10_4G_MON_CLA */
      val WI0C_M10_4G_MON_CLA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
