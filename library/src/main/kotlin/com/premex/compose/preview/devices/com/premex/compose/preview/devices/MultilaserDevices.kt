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
      /** DeviceSpec(manufacturer=Multilaser, code=astar-ococci, width=480, height=800, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=astar-ococci,
      width=480, height=800, dpi=120, isGoogleDevice=false).code */
      val ASTAR_OCOCCI = "spec:width=480,height=800,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=Multilaser, code=DI01_M7_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=DI01_M7_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val DI01_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=M10A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=M10A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M10A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=M10A_3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=M10A_3G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M10A_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=M10A-Lite, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=M10A-Lite,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val M10A_LITE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Multilaser, code=M7SQC_Plus, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=M7SQC_Plus,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val M7SQC_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=M9-3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=M9-3G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M9_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=M9-3G_2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=M9-3G_2,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val M9_3G_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=MLX8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=MLX8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MLX8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Multilaser, code=MLX8_4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=MLX8_4G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MLX8_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-CH-MS45_4G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-CH-MS45_4G,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val ML_CH_MS45_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_GW0C_M10_4G, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_GW0C_M10_4G,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val ML_GW0C_M10_4G = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-JI03-M10-4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-JI03-M10-4G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_JI03_M10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-JI04-M7-4G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-JI04-M7-4G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI04_M7_4G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-JI05-M9-3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-JI05-M9-3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI05_M9_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-JI06-M10-3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-JI06-M10-3G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_JI06_M10_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-JI07-M7S-LITE, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML-JI07-M7S-LITE, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI07_M7S_LITE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-JI08-M7S-PLUS, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML-JI08-M7S-PLUS, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI08_M7S_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-JI09-M9S-GO, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-JI09-M9S-GO,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI09_M9S_GO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-JI0A-M10-4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-JI0A-M10-4G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_JI0A_M10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI0B_M10_4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI0B_M10_4G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_JI0B_M10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI0C_M10_4G_AC, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML_JI0C_M10_4G_AC, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_JI0C_M10_4G_AC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI0D_M7_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI0D_M7_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI0D_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI0E_M9_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI0E_M9_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI0E_M9_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI0F_M10_4G_PRO, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML_JI0F_M10_4G_PRO, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_JI0F_M10_4G_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-JI0G-M7-3G-PLUS, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML-JI0G-M7-3G-PLUS, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI0G_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI0H_M10_3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI0H_M10_3G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_JI0H_M10_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI0I_M8_4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI0I_M8_4G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ML_JI0I_M8_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI0L_M10_4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI0L_M10_4G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_JI0L_M10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI0M_M10_4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI0M_M10_4G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_JI0M_M10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI0N_M7_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI0N_M7_3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI0N_M7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI0O_M7_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI0O_M7_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI0O_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI0S_M7_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI0S_M7_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI0S_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI0T_M9_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI0T_M9_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI0T_M9_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI0U_M9_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI0U_M9_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI0U_M9_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-JI11-M7_3G_PLUS, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML-JI11-M7_3G_PLUS, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI11_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-JI16-M10-3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-JI16-M10-3G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_JI16_M10_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI1D_M7_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI1D_M7_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI1D_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI1G_M7_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI1G_M7_3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI1G_M7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-JI21-M7-3G-PLUS, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML-JI21-M7-3G-PLUS, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI21_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-JI22-M7SQC_Plus, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML-JI22-M7SQC_Plus, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI22_M7SQC_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI2D_M7_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI2D_M7_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI2D_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI2G_M7_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI2G_M7_3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI2G_M7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_JI3D_M7_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_JI3D_M7_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI3D_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-JI-M7_3G_PLUS, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML-JI-M7_3G_PLUS, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_JI_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-SO06-M7sLite, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-SO06-M7sLite,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_SO06_M7SLITE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-SO06-M7S-LITE-KIDPAD, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML-SO06-M7S-LITE-KIDPAD, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_SO06_M7S_LITE_KIDPAD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-SO07-M7S-PLUS, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML-SO07-M7S-PLUS, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_SO07_M7S_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO08_M9_Wifi, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO08_M9_Wifi,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_SO08_M9_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO09_MLX8_4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO09_MLX8_4G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_SO09_MLX8_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0A_M10A_Lite, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML_SO0A_M10A_Lite, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_SO0A_M10A_LITE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0B_M10_3G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO0B_M10_3G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ML_SO0B_M10_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-SO0C_M10_4G_PRO_PLUS, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML-SO0C_M10_4G_PRO_PLUS, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_SO0C_M10_4G_PRO_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0C_ULTRA_10, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML_SO0C_ULTRA_10, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_SO0C_ULTRA_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0E_M7_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO0E_M7_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_SO0E_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0F_M8_WIFI, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO0F_M8_WIFI,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ML_SO0F_M8_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0G_M10_4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO0G_M10_4G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_SO0G_M10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0G_M10_4G_PRO_PLUS, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML_SO0G_M10_4G_PRO_PLUS, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_SO0G_M10_4G_PRO_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0J_M8_4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO0J_M8_4G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ML_SO0J_M8_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0K_M10_4G_T3, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML_SO0K_M10_4G_T3, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_SO0K_M10_4G_T3 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0K_U10_MTK, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO0K_U10_MTK,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_SO0K_U10_MTK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0P_M7_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO0P_M7_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_SO0P_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0Q_M10_3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO0Q_M10_3G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_SO0Q_M10_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0R_M7_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO0R_M7_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_SO0R_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0S_M7_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO0S_M7_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_SO0S_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0T_M8_WIFI, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO0T_M8_WIFI,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ML_SO0T_M8_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0U_M10_WIFI, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML_SO0U_M10_WIFI, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ML_SO0U_M10_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0V_M8_4G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO0V_M8_4G,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val ML_SO0V_M8_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO0W_M9_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO0W_M9_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_SO0W_M9_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO19_M8_4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO19_M8_4G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_SO19_M8_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO1E_M7_Wifi, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO1E_M7_Wifi,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_SO1E_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO1G_M10_4G_PRO, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML_SO1G_M10_4G_PRO, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_SO1G_M10_4G_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO1J_M8_4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO1J_M8_4G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ML_SO1J_M8_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO1S_M7_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO1S_M7_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_SO1S_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO1U_M10_WIFI, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML_SO1U_M10_WIFI, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_SO1U_M10_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO2E_M7_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_SO2E_M7_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_SO2E_M7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_SO5C_M10_4G_T1, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML_SO5C_M10_4G_T1, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_SO5C_M10_4G_T1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-SO-M7_3G_PLUS, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML-SO-M7_3G_PLUS, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_SO_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-SO-M9-3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-SO-M9-3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_SO_M9_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-TI0A-MS60X, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-TI0A-MS60X,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ML_TI0A_MS60X = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-TI0B-MS60Z, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-TI0B-MS60Z,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ML_TI0B_MS60Z = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-TI0C-MS60X, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-TI0C-MS60X,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ML_TI0C_MS60X = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-TI0D-MS80X, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-TI0D-MS80X,
      width=1080, height=2246, dpi=480, isGoogleDevice=false).code */
      val ML_TI0D_MS80X = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-TI-MS40G, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-TI-MS40G,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val ML_TI_MS40G = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-TI-MS50G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-TI-MS50G,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ML_TI_MS50G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-TI-MS50X, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-TI-MS50X,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ML_TI_MS50X = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-TI-MS80, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-TI-MS80,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ML_TI_MS80 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_WI0A_M7_3G_PLUS, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML_WI0A_M7_3G_PLUS, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_WI0A_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_WI0B_M7_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML_WI0B_M7_3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_WI0B_M7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-WI0C-M10-4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-WI0C-M10-4G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ML_WI0C_M10_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-WI0G-M8-4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-WI0G-M8-4G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ML_WI0G_M8_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_WI12_M7_3G_PLUS, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML_WI12_M7_3G_PLUS, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_WI12_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-WI16-M9_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-WI16-M9_3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_WI16_M9_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_WI1A_M7_3G_A10, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML_WI1A_M7_3G_A10, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_WI1A_M7_3G_A10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-WI1B-M7-3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-WI1B-M7-3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_WI1B_M7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-WI1C-M10-4G-T3, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML-WI1C-M10-4G-T3, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ML_WI1C_M10_4G_T3 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-WI23-MLX8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-WI23-MLX8,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ML_WI23_MLX8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_WI2A_M7_3G_A10, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML_WI2A_M7_3G_A10, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_WI2A_M7_3G_A10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_WI3A_M7_3G_A10, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML_WI3A_M7_3G_A10, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_WI3A_M7_3G_A10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML_WI4A_M7_3G_A10, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML_WI4A_M7_3G_A10, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_WI4A_M7_3G_A10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-WI-M7_3G_PLUS, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=ML-WI-M7_3G_PLUS, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_WI_M7_3G_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=ML-WI-M9-3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=ML-WI-M9-3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ML_WI_M9_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Multilaser, code=MS40S, width=480, height=800, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=MS40S, width=480,
      height=800, dpi=213, isGoogleDevice=false).code */
      val MS40S = "spec:width=480,height=800,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Multilaser, code=MS45S_A6, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=MS45S_A6,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val MS45S_A6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Multilaser, code=MS50L, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=MS50L, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MS50L = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Multilaser, code=MS50L_4G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=MS50L_4G,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val MS50L_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Multilaser, code=MS50S, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=MS50S, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MS50S = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Multilaser, code=MS55M, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=MS55M, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MS55M = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=MS60, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=MS60, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MS60 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=MS60F, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=MS60F, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MS60F = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=MS60F_PLUS, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=MS60F_PLUS,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val MS60F_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_E, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=Multilaser_E,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val MULTILASER_E = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_E_2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=Multilaser_E_2,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val MULTILASER_E_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_E_Lite, width=480, height=800,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=Multilaser_E_Lite, width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val MULTILASER_E_LITE = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_E_Pro, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=Multilaser_E_Pro,
      width=480, height=854, dpi=200, isGoogleDevice=false).code */
      val MULTILASER_E_PRO = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_F, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=Multilaser_F,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val MULTILASER_F = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_F2, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=Multilaser_F2,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val MULTILASER_F2 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_F_Max_2, width=720, height=1560,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=Multilaser_F_Max_2, width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val MULTILASER_F_MAX_2 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_F_Pro, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=Multilaser_F_Pro,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val MULTILASER_F_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_F_Pro_2, width=480, height=960,
      dpi=200, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=Multilaser_F_Pro_2, width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val MULTILASER_F_PRO_2 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_G, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=Multilaser_G,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val MULTILASER_G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_GMax_2_128, width=720, height=1600,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=Multilaser_GMax_2_128, width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val MULTILASER_GMAX_2_128 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_GMAX_2_64, width=720, height=1600,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=Multilaser_GMAX_2_64, width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val MULTILASER_GMAX_2_64 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_GPRO2, width=720, height=1600,
      dpi=280, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=Multilaser_GPRO2, width=720, height=1600, dpi=280, isGoogleDevice=false).code */
      val MULTILASER_GPRO2 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_G_2, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=Multilaser_G_2,
      width=720, height=1560, dpi=280, isGoogleDevice=false).code */
      val MULTILASER_G_2 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_G_3, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=Multilaser_G_3,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val MULTILASER_G_3 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_G_Max, width=720, height=1440,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=Multilaser_G_Max, width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val MULTILASER_G_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_G_Max_2_SE_64, width=720, height=1600,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=Multilaser_G_Max_2_SE_64, width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val MULTILASER_G_MAX_2_SE_64 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_G_Pro, width=720, height=1560,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=Multilaser_G_Pro, width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val MULTILASER_G_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_G_Pro_3S, width=720, height=1600,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=Multilaser_G_Pro_3S, width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val MULTILASER_G_PRO_3S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_H, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=Multilaser_H,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val MULTILASER_H = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Multilaser, code=Multilaser_H_5G, width=1080, height=2400,
      dpi=445, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=Multilaser_H_5G, width=1080, height=2400, dpi=445, isGoogleDevice=false).code */
      val MULTILASER_H_5G = "spec:width=1080,height=2400,unit=px,dpi=445"

      /** DeviceSpec(manufacturer=Multilaser, code=OBASMART_3, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=OBASMART_3,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val OBASMART_3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Multilaser, code=Obasmart_Conectamax, width=720, height=1600,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=Obasmart_Conectamax, width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val OBASMART_CONECTAMAX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Multilaser, code=Oba_Conecta_4G, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser, code=Oba_Conecta_4G,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val OBA_CONECTA_4G = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Multilaser, code=WI0C_M10_4G_MON_CLA, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Multilaser,
      code=WI0C_M10_4G_MON_CLA, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val WI0C_M10_4G_MON_CLA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
