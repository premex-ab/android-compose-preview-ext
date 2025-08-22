package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * condor device specifications for Android Compose previews.
 *
 * This extension provides condor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Condor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Condor: Any
  get() = object {
      /** DeviceSpec(manufacturer=condor, code=PGN409, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN409, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PGN409 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=condor, code=PGN511, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN511, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PGN511 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=condor, code=PGN513, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN513, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PGN513 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=condor, code=PGN514, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN514, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PGN514 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=condor, code=PGN515, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN515, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PGN515 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=condor, code=PGN516, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN516, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PGN516 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=condor, code=PGN517, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN517, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PGN517 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=condor, code=PGN518, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN518, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PGN518 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=condor, code=PGN521, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN521, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PGN521 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=condor, code=PGN522, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN522, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PGN522 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=condor, code=PGN523, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN523, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PGN523 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=condor, code=PGN527, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN527, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PGN527 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=condor, code=PGN528, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN528, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PGN528 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=condor, code=PGN605, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN605, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PGN605 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=condor, code=PGN606, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN606, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PGN606 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=condor, code=PGN607, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN607, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val PGN607 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=condor, code=PGN608, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN608, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PGN608 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=condor, code=PGN609, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN609, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PGN609 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=condor, code=PGN610, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN610, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PGN610 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=condor, code=PGN611, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN611, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PGN611 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=condor, code=PGN612, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PGN612, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PGN612 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=condor, code=PHQ520, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=PHQ520, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PHQ520 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=condor, code=TGW102L, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=TGW102L, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val TGW102L = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=condor, code=TGW801G, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=TGW801G, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val TGW801G = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=condor, code=TGW801L, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=condor, code=TGW801L, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val TGW801L = "spec:width=800,height=1280,unit=px,dpi=180"

  }
