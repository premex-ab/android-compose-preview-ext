package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OnePlus device specifications for Android Compose previews.
 *
 * This extension provides OnePlus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OnePlus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OnePlus: Any
  get() = object {
      /** OnePlus Cebu */
      val CEBU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** OnePlus Dubai */
      val DUBAI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** OnePlus Edinburgh */
      val EDINBURGH = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** OnePlus Nord */
      val NORD = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** OnePlus OnePlus */
      val ONEPLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** OnePlus OnePlus2 */
      val ONEPLUS2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** OnePlus OnePlus3 */
      val ONEPLUS3 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** OnePlus OnePlus5T */
      val ONEPLUS5T = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** OnePlus OnePlus6 */
      val ONEPLUS6 = "spec:width=1080,height=2280,unit=px,dpi=450"

      /** OnePlus OnePlus6T */
      val ONEPLUS6T = "spec:width=1080,height=2340,unit=px,dpi=450"

      /** OnePlus OnePlus6TSingle */
      val ONEPLUS6TSINGLE = "spec:width=1080,height=2340,unit=px,dpi=450"

      /** OnePlus OnePlus7 */
      val ONEPLUS7 = "spec:width=1080,height=2340,unit=px,dpi=450"

      /** OnePlus OnePlus7Pro */
      val ONEPLUS7PRO = "spec:width=1440,height=3120,unit=px,dpi=600"

      /** OnePlus OnePlus7ProNR */
      val ONEPLUS7PRONR = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** OnePlus OnePlus7ProTMO */
      val ONEPLUS7PROTMO = "spec:width=1440,height=3120,unit=px,dpi=600"

      /** OnePlus OnePlus7T */
      val ONEPLUS7T = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** OnePlus OnePlus7TPro */
      val ONEPLUS7TPRO = "spec:width=1440,height=3120,unit=px,dpi=600"

      /** OnePlus OnePlus7TProNR */
      val ONEPLUS7TPRONR = "spec:width=1440,height=3120,unit=px,dpi=600"

      /** OnePlus OnePlus7TTMO */
      val ONEPLUS7TTMO = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** OnePlus OnePlus8 */
      val ONEPLUS8 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OnePlus8T */
      val ONEPLUS8T = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OnePlus8TMO */
      val ONEPLUS8TMO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OnePlus8TTMO */
      val ONEPLUS8TTMO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OnePlus8Visible */
      val ONEPLUS8VISIBLE = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** OnePlus OnePlus8VZW */
      val ONEPLUS8VZW = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** OnePlus OnePlus9 */
      val ONEPLUS9 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OnePlus9ProTMO */
      val ONEPLUS9PROTMO = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** OnePlus OnePlus9R */
      val ONEPLUS9R = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OnePlus9TMO */
      val ONEPLUS9TMO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OnePlusN10 */
      val ONEPLUSN10 = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** OnePlus OnePlusN100 */
      val ONEPLUSN100 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** OnePlus OnePlusN100METRO */
      val ONEPLUSN100METRO = "spec:width=720,height=1600,unit=px,dpi=300"

      /** OnePlus OnePlusN100TMO */
      val ONEPLUSN100TMO = "spec:width=720,height=1600,unit=px,dpi=300"

      /** OnePlus OnePlusN10METRO */
      val ONEPLUSN10METRO = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** OnePlus OnePlusN10TMO */
      val ONEPLUSN10TMO = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** OnePlus OnePlusN200 */
      val ONEPLUSN200 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OnePlusN200TMO */
      val ONEPLUSN200TMO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OP5154L1 */
      val OP5154L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OP5155L1 */
      val OP5155L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OP5159L1 */
      val OP5159L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OP515AL1 */
      val OP515AL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OP515BL1 */
      val OP515BL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OP516EL1 */
      val OP516EL1 = "spec:width=1440,height=3216,unit=px,dpi=480"

      /** OnePlus OP535DL1 */
      val OP535DL1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** OnePlus OP555BL1 */
      val OP555BL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OP5565 */
      val OP5565 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** OnePlus OP5566L1 */
      val OP5566L1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** OnePlus OP5567L1 */
      val OP5567L1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** OnePlus OP556FL1 */
      val OP556FL1 = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** OnePlus OP557AL1 */
      val OP557AL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OP5911 */
      val OP5911 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** OnePlus OP591BL1 */
      val OP591BL1 = "spec:width=1440,height=3216,unit=px,dpi=480"

      /** OnePlus OP5927 */
      val OP5927 = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** OnePlus OP5929L1 */
      val OP5929L1 = "spec:width=1440,height=3216,unit=px,dpi=640"

      /** OnePlus OP5943L1 */
      val OP5943L1 = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** OnePlus OP594DL1 */
      val OP594DL1 = "spec:width=1440,height=3216,unit=px,dpi=480"

      /** OnePlus OP5955L1 */
      val OP5955L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OP5958L1 */
      val OP5958L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OP595DL1 */
      val OP595DL1 = "spec:width=1440,height=3216,unit=px,dpi=640"

      /** OnePlus OP5961L1 */
      val OP5961L1 = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** OnePlus OP5973L1 */
      val OP5973L1 = "spec:width=2268,height=2440,unit=px,dpi=520"

      /** OnePlus OP59BCL1 */
      val OP59BCL1 = "spec:width=2000,height=2800,unit=px,dpi=400"

      /** OnePlus OP5CF9L1 */
      val OP5CF9L1 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** OnePlus OP5CFBL1 */
      val OP5CFBL1 = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** OnePlus OP5D06L1 */
      val OP5D06L1 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** OnePlus OP5D0DL1 */
      val OP5D0DL1 = "spec:width=1440,height=3216,unit=px,dpi=640"

      /** OnePlus OP5D2BL1 */
      val OP5D2BL1 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** OnePlus OP5D35L1 */
      val OP5D35L1 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** OnePlus OP5D3BL1 */
      val OP5D3BL1 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** OnePlus OP5D3FL1 */
      val OP5D3FL1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** OnePlus OP5D49L1 */
      val OP5D49L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OnePlus OP5D55L1 */
      val OP5D55L1 = "spec:width=1440,height=3216,unit=px,dpi=640"

      /** OnePlus OP5D77L1 */
      val OP5D77L1 = "spec:width=2120,height=3000,unit=px,dpi=420"

      /** OnePlus OP5DA6L1 */
      val OP5DA6L1 = "spec:width=1720,height=2408,unit=px,dpi=360"

      /** OnePlus OP5DAAL1 */
      val OP5DAAL1 = "spec:width=2120,height=3000,unit=px,dpi=420"

      /** OnePlus OP5E93L1 */
      val OP5E93L1 = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** OnePlus OP60EBL1 */
      val OP60EBL1 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** OnePlus OP60EDL1 */
      val OP60EDL1 = "spec:width=1272,height=2800,unit=px,dpi=560"

      /** OnePlus OP60F5L1 */
      val OP60F5L1 = "spec:width=1216,height=2640,unit=px,dpi=560"

      /** OnePlus OP60F9L1 */
      val OP60F9L1 = "spec:width=1080,height=2392,unit=px,dpi=480"

      /** OnePlus OP612BL1 */
      val OP612BL1 = "spec:width=1216,height=2640,unit=px,dpi=560"

      /** OnePlus OP6131L1 */
      val OP6131L1 = "spec:width=1272,height=2800,unit=px,dpi=560"

      /** OnePlus OP613BL1 */
      val OP613BL1 = "spec:width=1080,height=2392,unit=px,dpi=480"

      /** OnePlus OP615AL1 */
      val OP615AL1 = "spec:width=2000,height=2800,unit=px,dpi=400"

      /** OnePlus OP615EL1 */
      val OP615EL1 = "spec:width=2400,height=3392,unit=px,dpi=420"

      /** OnePlus OP6190L1 */
      val OP6190L1 = "spec:width=2400,height=3392,unit=px,dpi=420"

      /** OnePlus OP6195L1 */
      val OP6195L1 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** OnePlus OP7ProNRSpr */
      val OP7PRONRSPR = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** OnePlus OPWE242 */
      val OPWE242 = "spec:width=466,height=466,unit=px,dpi=360"

      /** OnePlus OPWWE231 */
      val OPWWE231 = "spec:width=466,height=466,unit=px,dpi=320"

      /** OnePlus OPWWE234 */
      val OPWWE234 = "spec:width=466,height=466,unit=px,dpi=320"

      /** OnePlus OPWWE251 */
      val OPWWE251 = "spec:width=466,height=466,unit=px,dpi=320"

      /** OnePlus shibuya */
      val SHIBUYA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
