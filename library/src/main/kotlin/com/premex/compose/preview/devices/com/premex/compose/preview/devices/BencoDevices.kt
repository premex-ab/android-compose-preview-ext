package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * benco device specifications for Android Compose previews.
 *
 * This extension provides benco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Benco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Benco: Any
  get() = object {
      /** DeviceSpec(manufacturer=benco, code=AE9010, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AE9010, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val AE9010 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=benco, code=AE9110, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AE9110, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val AE9110 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=benco, code=AE9120, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AE9120, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val AE9120 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=benco, code=AE9150, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AE9150, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val AE9150 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=benco, code=AE9230, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AE9230, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val AE9230 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=benco, code=AE9240, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AE9240, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val AE9240 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=benco, code=AE9250, width=480, height=1014, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AE9250, width=480,
      height=1014, dpi=220, isGoogleDevice=false).code */
      val AE9250 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=benco, code=AE9260, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AE9260, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val AE9260 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=benco, code=AE9310, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AE9310, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val AE9310 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=benco, code=AE9950, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AE9950, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val AE9950 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=benco, code=AEOP513, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AEOP513, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val AEOP513 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=benco, code=AEOP517, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AEOP517, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val AEOP517 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=benco, code=AEOP519, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AEOP519, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val AEOP519 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=benco, code=AEOP520, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AEOP520, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val AEOP520 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=benco, code=AEOP523, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AEOP523, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val AEOP523 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=benco, code=AEOP525, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AEOP525, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val AEOP525 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=benco, code=AEOP526, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AEOP526, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val AEOP526 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=benco, code=AF9010_F, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AF9010_F, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val AF9010_F = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=benco, code=AF9020, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AF9020, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val AF9020 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=benco, code=AF9030, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AF9030, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val AF9030 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=benco, code=AH9110, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AH9110, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val AH9110 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=benco, code=AH9210, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AH9210, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val AH9210 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=benco, code=AH9910, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=AH9910, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val AH9910 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=benco, code=M1000, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=M1000, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M1000 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=benco, code=M700, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benco, code=M700, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M700 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
