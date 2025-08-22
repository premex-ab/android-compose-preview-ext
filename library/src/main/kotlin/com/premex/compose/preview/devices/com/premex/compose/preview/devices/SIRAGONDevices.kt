package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SIRAGON device specifications for Android Compose previews.
 *
 * This extension provides SIRAGON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SIRAGON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SIRAGON: Any
  get() = object {
      /** DeviceSpec(manufacturer=SIRAGON, code=elliniko, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SIRAGON, code=elliniko, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SIRAGON, code=hongkong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SIRAGON, code=hongkong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SIRAGON, code=lavender, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SIRAGON, code=lavender, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SIRAGON, code=mountbaker, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SIRAGON, code=mountbaker,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SIRAGON, code=R3_GTV, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SIRAGON, code=R3_GTV, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SIRAGON, code=R4_GTV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SIRAGON, code=R4_GTV, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SIRAGON, code=SP-5400, width=720, height=1280, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SIRAGON, code=SP-5400, width=720,
      height=1280, dpi=300, isGoogleDevice=false).code */
      val SP_5400 = "spec:width=720,height=1280,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=SIRAGON, code=SP-6100, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SIRAGON, code=SP-6100, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val SP_6100 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SIRAGON, code=stanford, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SIRAGON, code=stanford, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SIRAGON, code=zhongshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SIRAGON, code=zhongshan,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
