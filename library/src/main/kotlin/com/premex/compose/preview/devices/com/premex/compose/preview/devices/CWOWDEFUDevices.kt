package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CWOWDEFU device specifications for Android Compose previews.
 *
 * This extension provides CWOWDEFU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CWOWDEFU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CWOWDEFU: Any
  get() = object {
      /** DeviceSpec(manufacturer=CWOWDEFU, code=C10W_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=C10W_EEA, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val C10W_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=C18W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=C18W, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val C18W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=C18W_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=C18W_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val C18W_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=C28, width=600, height=1024, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=C28, width=600,
      height=1024, dpi=200, isGoogleDevice=false).code */
      val C28 = "spec:width=600,height=1024,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=C6, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=C6, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val C6 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=C73W, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=C73W, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val C73W = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=C77W, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=C77W, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val C77W = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=C77W_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=C77W_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val C77W_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=C80W, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=C80W, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val C80W = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=C82W, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=C82W, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C82W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=C82W_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=C82W_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C82W_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=C84W, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=C84W, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val C84W = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=C86W, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=C86W, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C86W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=C86W_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=C86W_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val C86W_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=F13W, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=F13W, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val F13W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=F13W_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=F13W_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val F13W_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=F35W, width=800, height=1333, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=F35W, width=800,
      height=1333, dpi=160, isGoogleDevice=false).code */
      val F35W = "spec:width=800,height=1333,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=F80L, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=F80L, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val F80L = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=F80W, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=F80W, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val F80W = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=F80W_EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=F80W_EEA,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val F80W_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=F81L, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=F81L, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val F81L = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=P12W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=P12W, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P12W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=P12W_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=P12W_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P12W_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=P15W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=P15W, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P15W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=P15W_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=P15W_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P15W_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=P16-C, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=P16-C, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val P16_C = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=P25L, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=P25L, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val P25L = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=P35W, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=P35W, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val P35W = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=P35W_EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=P35W_EEA,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val P35W_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=P38W, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=P38W, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val P38W = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=P38W_EEA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=P38W_EEA,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val P38W_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=P50L_EEA, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=P50L_EEA,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val P50L_EEA = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=P80L, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=P80L, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val P80L = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=S18, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=S18, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val S18 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CWOWDEFU, code=S28, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CWOWDEFU, code=S28, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S28 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
