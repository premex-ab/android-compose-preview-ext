package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Quantum device specifications for Android Compose previews.
 *
 * This extension provides Quantum device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Quantum.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Quantum: Any
  get() = object {
      /** DeviceSpec(manufacturer=Quantum, code=Q03, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quantum, code=Q03, width=480,
      height=1014, dpi=200, isGoogleDevice=false).code */
      val Q03 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Quantum, code=Q11, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quantum, code=Q11, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q11 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Quantum, code=Q13, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quantum, code=Q13, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q13 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Quantum, code=Q17, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quantum, code=Q17, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q17 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Quantum, code=Q19, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quantum, code=Q19, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q19 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Quantum, code=Q2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quantum, code=Q2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Quantum, code=Q3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quantum, code=Q3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Quantum, code=Q3C, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quantum, code=Q3C, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q3C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Quantum, code=Q5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quantum, code=Q5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Quantum, code=QC84, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quantum, code=QC84, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val QC84 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Quantum, code=QE83, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quantum, code=QE83, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val QE83 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Quantum, code=QM83, width=720, height=1440, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quantum, code=QM83, width=720,
      height=1440, dpi=260, isGoogleDevice=false).code */
      val QM83 = "spec:width=720,height=1440,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Quantum, code=QX1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quantum, code=QX1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val QX1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Quantum, code=QX2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quantum, code=QX2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val QX2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Quantum, code=S518AR, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quantum, code=S518AR, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S518AR = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Quantum, code=S600AR, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quantum, code=S600AR, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val S600AR = "spec:width=480,height=960,unit=px,dpi=200"

  }
