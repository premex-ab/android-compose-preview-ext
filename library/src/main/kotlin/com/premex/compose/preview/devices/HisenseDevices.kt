package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hisense device specifications for Android Compose previews.
 *
 * This extension provides Hisense device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hisense.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hisense: Any
  get() = object {
      /** Hisense changjiang */
      val CHANGJIANG = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** Hisense hamamatsucho */
      val HAMAMATSUCHO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Hisense harajuku */
      val HARAJUKU = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Hisense helium3 */
      val HELIUM3 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hisense hengshan */
      val HENGSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** Hisense hirano */
      val HIRANO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Hisense HLTE100E_11 */
      val HLTE100E_11 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Hisense HLTE100E_12 */
      val HLTE100E_12 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Hisense HLTE100E_14 */
      val HLTE100E_14 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Hisense HLTE100E_20 */
      val HLTE100E_20 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Hisense HLTE100E_21 */
      val HLTE100E_21 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Hisense HLTE100E_22 */
      val HLTE100E_22 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Hisense HLTE103E_20 */
      val HLTE103E_20 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Hisense HLTE103E_22 */
      val HLTE103E_22 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Hisense HLTE103E_24 */
      val HLTE103E_24 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Hisense HLTE103E_30 */
      val HLTE103E_30 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Hisense HLTE103E_31 */
      val HLTE103E_31 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Hisense HLTE103E_32 */
      val HLTE103E_32 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Hisense HLTE103E_33 */
      val HLTE103E_33 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Hisense HLTE103E_40 */
      val HLTE103E_40 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Hisense HLTE103E_41 */
      val HLTE103E_41 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Hisense HLTE105E */
      val HLTE105E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE105E_02 */
      val HLTE105E_02 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE105E_03 */
      val HLTE105E_03 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE106E_01 */
      val HLTE106E_01 = "spec:width=480,height=1010,unit=px,dpi=240"

      /** Hisense HLTE106E_30 */
      val HLTE106E_30 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Hisense HLTE106E_31 */
      val HLTE106E_31 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Hisense HLTE106E_40 */
      val HLTE106E_40 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Hisense HLTE106E_41 */
      val HLTE106E_41 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Hisense HLTE109E */
      val HLTE109E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE109E_01 */
      val HLTE109E_01 = "spec:width=540,height=1092,unit=px,dpi=240"

      /** Hisense HLTE109E_02 */
      val HLTE109E_02 = "spec:width=480,height=960,unit=px,dpi=213"

      /** Hisense HLTE109E_03 */
      val HLTE109E_03 = "spec:width=480,height=960,unit=px,dpi=213"

      /** Hisense HLTE120E */
      val HLTE120E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Hisense HLTE120E_01 */
      val HLTE120E_01 = "spec:width=720,height=1552,unit=px,dpi=272"

      /** Hisense HLTE121E */
      val HLTE121E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE202N */
      val HLTE202N = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** Hisense HLTE203T */
      val HLTE203T = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Hisense HLTE222E */
      val HLTE222E = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Hisense HLTE222E_01 */
      val HLTE222E_01 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Hisense HLTE226E */
      val HLTE226E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE228E_01 */
      val HLTE228E_01 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE228E_02 */
      val HLTE228E_02 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE228E_10 */
      val HLTE228E_10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE228E_11 */
      val HLTE228E_11 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE228E_12 */
      val HLTE228E_12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE228E_14 */
      val HLTE228E_14 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE228E_20 */
      val HLTE228E_20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE228E_22 */
      val HLTE228E_22 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE229E */
      val HLTE229E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE229E_01 */
      val HLTE229E_01 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE229E_10 */
      val HLTE229E_10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE229E_11 */
      val HLTE229E_11 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE229E_12 */
      val HLTE229E_12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE229E_30 */
      val HLTE229E_30 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE230E_01 */
      val HLTE230E_01 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE230E_20 */
      val HLTE230E_20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE232E */
      val HLTE232E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE232E_01 */
      val HLTE232E_01 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE232E_10 */
      val HLTE232E_10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE232E_12 */
      val HLTE232E_12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE232E_20 */
      val HLTE232E_20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE233E */
      val HLTE233E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE233E_01 */
      val HLTE233E_01 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE233E_10 */
      val HLTE233E_10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE233E_11 */
      val HLTE233E_11 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE234E */
      val HLTE234E = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Hisense HLTE235E */
      val HLTE235E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE235E_12 */
      val HLTE235E_12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE235E_20 */
      val HLTE235E_20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE240E */
      val HLTE240E = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Hisense HLTE243E */
      val HLTE243E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE243E_01 */
      val HLTE243E_01 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE262E */
      val HLTE262E = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Hisense HLTE262E_01 */
      val HLTE262E_01 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Hisense HLTE263E */
      val HLTE263E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hisense HLTE315E */
      val HLTE315E = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Hisense HLTE321E */
      val HLTE321E = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Hisense HLTE322E */
      val HLTE322E = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Hisense HLTE730T */
      val HLTE730T = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Hisense HNR500E */
      val HNR500E = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Hisense HNR500E_02 */
      val HNR500E_02 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Hisense HNR500E_03 */
      val HNR500E_03 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Hisense HNR510E */
      val HNR510E = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Hisense HS6580MT */
      val HS6580MT = "spec:width=480,height=960,unit=px,dpi=240"

      /** Hisense HS6735MT */
      val HS6735MT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Hisense HS6737MT */
      val HS6737MT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Hisense HS6739MT */
      val HS6739MT = "spec:width=480,height=960,unit=px,dpi=240"

      /** Hisense HS6763MT */
      val HS6763MT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Hisense HS7331CSC */
      val HS7331CSC = "spec:width=480,height=854,unit=px,dpi=240"

      /** Hisense HS7731CSP */
      val HS7731CSP = "spec:width=480,height=854,unit=px,dpi=240"

      /** Hisense HS7731SP */
      val HS7731SP = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Hisense HS8909QC */
      val HS8909QC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Hisense HS8916QC */
      val HS8916QC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Hisense HS8917QC */
      val HS8917QC = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Hisense HS8929QC */
      val HS8929QC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Hisense HS8937QC */
      val HS8937QC = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Hisense HS8953QC */
      val HS8953QC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Hisense HSSC9850 */
      val HSSC9850 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Hisense HSSDM450QC */
      val HSSDM450QC = "spec:width=720,height=1500,unit=px,dpi=320"

      /** Hisense huaihe */
      val HUAIHE = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** Hisense huanghe */
      val HUANGHE = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** Hisense huangshan */
      val HUANGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hisense laohushan */
      val LAOHUSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hisense laoshan */
      val LAOSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hisense lushan */
      val LUSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** Hisense m470 */
      val M470 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hisense moeraki */
      val MOERAKI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hisense rk3028a */
      val RK3028A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Hisense rk3288 */
      val RK3288 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** Hisense SC9832E */
      val SC9832E = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Hisense SC9863A */
      val SC9863A = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Hisense SC9863A_RU */
      val SC9863A_RU = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Hisense songshan */
      val SONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hisense taishan */
      val TAISHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hisense vision2_1 */
      val VISION2_1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hisense vision2_5 */
      val VISION2_5 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hisense wutaishan */
      val WUTAISHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** Hisense wuyishan */
      val WUYISHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hisense xiaoyushan */
      val XIAOYUSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hisense xinhaoshan */
      val XINHAOSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
