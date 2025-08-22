package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Prestigio device specifications for Android Compose previews.
 *
 * This extension provides Prestigio device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Prestigio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Prestigio: Any
  get() = object {
      /** DeviceSpec(manufacturer=Prestigio, code=BW50B1L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=BW50B1L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BW50B1L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=CD10A2G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=CD10A2G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CD10A2G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=CD10A4L, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=CD10A4L, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CD10A4L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=CD10A7G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=CD10A7G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CD10A7G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=CD10A8L, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=CD10A8L, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CD10A8L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=CD80A1G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=CD80A1G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CD80A1G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=CD80A3L, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=CD80A3L, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CD80A3L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=CD80A5G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=CD80A5G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CD80A5G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=CD80A6L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=CD80A6L, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CD80A6L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=CF10A1L, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=CF10A1L, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CF10A1L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=CF80A2G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=CF80A2G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CF80A2G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=CF80A5L, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=CF80A5L,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val CF80A5L = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Prestigio, code=DTE50B8L, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=DTE50B8L,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val DTE50B8L = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Prestigio, code=DW50A03G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=DW50A03G,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val DW50A03G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=DW50B5G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=DW50B5G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DW50B5G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=DW53B01G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=DW53B01G,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val DW53B01G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=DW53B3G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=DW53B3G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DW53B3G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=DW53B4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=DW53B4G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DW53B4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=DW55B02L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=DW55B02L,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val DW55B02L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=DW55B8L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=DW55B8L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DW55B8L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=EB50B1L, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=EB50B1L, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EB50B1L = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=HP10A11W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HP10A11W,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val HP10A11W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=HP10A12L, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HP10A12L,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val HP10A12L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=HP10A17L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HP10A17L,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HP10A17L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=HP10A4L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HP10A4L, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HP10A4L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=HP10A5L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HP10A5L, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HP10A5L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=HP70A10L, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HP70A10L,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val HP70A10L = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=HP70A14W, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HP70A14W,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val HP70A14W = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=HP70A15G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HP70A15G,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val HP70A15G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=HP70A1W, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HP70A1W, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val HP70A1W = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=HP70A2G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HP70A2G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val HP70A2G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=HP70A3L, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HP70A3L, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val HP70A3L = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=HP70A6L, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HP70A6L, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val HP70A6L = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=HP70A7G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HP70A7G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val HP70A7G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=HP80A16G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HP80A16G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HP80A16G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=HP80A21G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HP80A21G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HP80A21G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=HP8A6L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HP8A6L, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HP8A6L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=HT50B2G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=HT50B2G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HT50B2G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=IN39B3G, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=IN39B3G, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val IN39B3G = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Prestigio, code=IN50B1L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=IN50B1L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IN50B1L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=JU10A3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=JU10A3G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val JU10A3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=JU70A1G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=JU70A1G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val JU70A1G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=JU80A2G, width=800, height=1280, dpi=190,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=JU80A2G, width=800,
      height=1280, dpi=190, isGoogleDevice=false).code */
      val JU80A2G = "spec:width=800,height=1280,unit=px,dpi=190"

      /** DeviceSpec(manufacturer=Prestigio, code=KN54B1L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=KN54B1L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val KN54B1L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=LS10A3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=LS10A3G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val LS10A3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=LS10A8L, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=LS10A8L,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val LS10A8L = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Prestigio, code=LS70A2G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=LS70A2G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val LS70A2G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=LS70A5G, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=LS70A5G, width=720,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val LS70A5G = "spec:width=720,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=LS70A6L, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=LS70A6L, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val LS70A6L = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=LS80A1L, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=LS80A1L, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val LS80A1L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=LS80A4L, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=LS80A4L, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val LS80A4L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=LS96A7G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=LS96A7G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val LS96A7G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=NS70A03W, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=NS70A03W,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val NS70A03W = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=PMT3011_3G, width=600, height=1024, dpi=132,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PMT3011_3G,
      width=600, height=1024, dpi=132, isGoogleDevice=false).code */
      val PMT3011_3G = "spec:width=600,height=1024,unit=px,dpi=132"

      /** DeviceSpec(manufacturer=Prestigio, code=PMT3038_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PMT3038_3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PMT3038_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=PMT3057_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PMT3057_3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PMT3057_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=PMT3277_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PMT3277_3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PMT3277_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=PMT3287_3G, width=770, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PMT3287_3G,
      width=770, height=1024, dpi=160, isGoogleDevice=false).code */
      val PMT3287_3G = "spec:width=770,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=PMT3777_3G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PMT3777_3G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PMT3777_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=PMT5001_3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PMT5001_3G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PMT5001_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=PMT5002_Wi, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PMT5002_Wi,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PMT5002_WI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=PMT5008_3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PMT5008_3G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PMT5008_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=PMT5287_4G, width=770, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PMT5287_4G,
      width=770, height=1024, dpi=160, isGoogleDevice=false).code */
      val PMT5287_4G = "spec:width=770,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=PMT5487_3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PMT5487_3G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PMT5487_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=PMT5777_3G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PMT5777_3G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PMT5777_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=PMT5887_3G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PMT5887_3G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PMT5887_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=PMT7077_3G, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PMT7077_3G,
      width=768, height=1024, dpi=160, isGoogleDevice=false).code */
      val PMT7077_3G = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=PMT7177_3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PMT7177_3G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PMT7177_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=PMT7287_3G, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PMT7287_3G,
      width=768, height=1024, dpi=160, isGoogleDevice=false).code */
      val PMT7287_3G = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=PN10A01G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PN10A01G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PN10A01G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=PN80A03G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PN80A03G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PN80A03G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=PSP5504DUO, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=PSP5504DUO,
      width=540, height=960, dpi=240, isGoogleDevice=false).code */
      val PSP5504DUO = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Prestigio, code=TC10A2L, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=TC10A2L, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TC10A2L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=TC10A3L, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=TC10A3L,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TC10A3L = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Prestigio, code=TC70A1G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=TC70A1G, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val TC70A1G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=TE50B2G, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=TE50B2G, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val TE50B2G = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=TE50B4L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=TE50B4L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TE50B4L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=TE52B10G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=TE52B10G,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val TE52B10G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=TE55B9G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=TE55B9G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TE55B9G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=TL47B1G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=TL47B1G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TL47B1G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Prestigio, code=TL49B4L, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=TL49B4L, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TL49B4L = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Prestigio, code=TL52B5L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=TL52B5L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TL52B5L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=TL55B3L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=TL55B3L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TL55B3L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=TL61B8L, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=TL61B8L, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val TL61B8L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=TL80A15G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=TL80A15G,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val TL80A15G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Prestigio, code=UE55B1L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=UE55B1L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val UE55B1L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Prestigio, code=WT10A1G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=WT10A1G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val WT10A1G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Prestigio, code=WT10A2G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=WT10A2G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val WT10A2G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Prestigio, code=WT70A1L, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio, code=WT70A1L, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val WT70A1L = "spec:width=600,height=1024,unit=px,dpi=160"

  }
