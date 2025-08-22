package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EPIKONE device specifications for Android Compose previews.
 *
 * This extension provides EPIKONE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EPIKONE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EPIKONE: Any
  get() = object {
      /** DeviceSpec(manufacturer=EPIKONE, code=K406, width=360, height=640, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K406, width=360,
      height=640, dpi=160, isGoogleDevice=false).code */
      val K406 = "spec:width=360,height=640,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EPIKONE, code=K501, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K501, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val K501 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EPIKONE, code=K501_Plus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K501_Plus, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val K501_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EPIKONE, code=K503, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K503, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val K503 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EPIKONE, code=K503HD, width=720, height=1280, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K503HD, width=720,
      height=1280, dpi=300, isGoogleDevice=false).code */
      val K503HD = "spec:width=720,height=1280,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=EPIKONE, code=K503S, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K503S, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val K503S = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EPIKONE, code=K503T, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K503T, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val K503T = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EPIKONE, code=K504, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K504, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val K504 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EPIKONE, code=K506, width=480, height=854, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K506, width=480,
      height=854, dpi=220, isGoogleDevice=false).code */
      val K506 = "spec:width=480,height=854,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=EPIKONE, code=K511, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K511, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val K511 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EPIKONE, code=K536, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K536, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val K536 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EPIKONE, code=K545, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K545, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val K545 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EPIKONE, code=K546, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K546, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val K546 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EPIKONE, code=K600, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K600, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val K600 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EPIKONE, code=K601, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K601, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val K601 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EPIKONE, code=K604, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K604, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val K604 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=EPIKONE, code=K605, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=K605, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val K605 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=EPIKONE, code=TX1000, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=TX1000, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TX1000 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EPIKONE, code=TX800, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=TX800, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val TX800 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EPIKONE, code=X410, width=360, height=640, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=X410, width=360,
      height=640, dpi=160, isGoogleDevice=false).code */
      val X410 = "spec:width=360,height=640,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EPIKONE, code=X430, width=360, height=640, dpi=165,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=X430, width=360,
      height=640, dpi=165, isGoogleDevice=false).code */
      val X430 = "spec:width=360,height=640,unit=px,dpi=165"

      /** DeviceSpec(manufacturer=EPIKONE, code=X515, width=720, height=1280, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=X515, width=720,
      height=1280, dpi=300, isGoogleDevice=false).code */
      val X515 = "spec:width=720,height=1280,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=EPIKONE, code=X516, width=720, height=1280, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=X516, width=720,
      height=1280, dpi=300, isGoogleDevice=false).code */
      val X516 = "spec:width=720,height=1280,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=EPIKONE, code=X547, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=X547, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val X547 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EPIKONE, code=X572, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=X572, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val X572 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EPIKONE, code=X610, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=X610, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val X610 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EPIKONE, code=X618, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=X618, width=720,
      height=1560, dpi=300, isGoogleDevice=false).code */
      val X618 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=EPIKONE, code=X620, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=X620, width=720,
      height=1560, dpi=300, isGoogleDevice=false).code */
      val X620 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=EPIKONE, code=X650, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=X650, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val X650 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=EPIKONE, code=X655, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIKONE, code=X655, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val X655 = "spec:width=720,height=1600,unit=px,dpi=300"

  }
