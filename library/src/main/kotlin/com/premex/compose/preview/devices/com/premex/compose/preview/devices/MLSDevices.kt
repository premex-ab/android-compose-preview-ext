package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MLS device specifications for Android Compose previews.
 *
 * This extension provides MLS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MLS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MLS: Any
  get() = object {
      /** DeviceSpec(manufacturer=MLS, code=iQ1012N, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQ1012N, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IQ1012N = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MLS, code=IQ1019N, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=IQ1019N, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val IQ1019N = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MLS, code=iQ1060M, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQ1060M, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val IQ1060M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MLS, code=iQ1568, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQ1568, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val IQ1568 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MLS, code=iQ181011N, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQ181011N, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val IQ181011N = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MLS, code=iQ5011_E, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQ5011_E, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val IQ5011_E = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MLS, code=iQ8011, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQ8011, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val IQ8011 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=MLS, code=iQ9013_4N, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQ9013_4N, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IQ9013_4N = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MLS, code=iQA27X_E, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQA27X_E, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val IQA27X_E = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MLS, code=iQD10S, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQD10S, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val IQD10S = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MLS, code=iQD700, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQD700, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IQD700 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MLS, code=iQE200, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQE200, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IQE200 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MLS, code=iQGW516, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQGW516, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val IQGW516 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MLS, code=iQL550, width=540, height=1132, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQL550, width=540,
      height=1132, dpi=240, isGoogleDevice=false).code */
      val IQL550 = "spec:width=540,height=1132,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MLS, code=iQL626, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQL626, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val IQL626 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MLS, code=iQM960, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQM960, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val IQM960 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MLS, code=iQM960L, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQM960L, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val IQM960L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MLS, code=iQN700, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQN700, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val IQN700 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MLS, code=iQS1001, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQS1001, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IQS1001 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MLS, code=iQS300, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQS300, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IQS300 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MLS, code=iQS805, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQS805, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val IQS805 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MLS, code=iQT1161, width=1080, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQT1161, width=1080,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val IQT1161 = "spec:width=1080,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=MLS, code=iQT800, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQT800, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val IQT800 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MLS, code=iQW511T, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQW511T, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val IQW511T = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MLS, code=iQW608, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQW608, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val IQW608 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MLS, code=iQW626, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLS, code=iQW626, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val IQW626 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
