package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KIOWA device specifications for Android Compose previews.
 *
 * This extension provides KIOWA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KIOWA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KIOWA: Any
  get() = object {
      /** DeviceSpec(manufacturer=KIOWA, code=A5_CRISTAL, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KIOWA, code=A5_CRISTAL, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val A5_CRISTAL = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KIOWA, code=lavender, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KIOWA, code=lavender, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KIOWA, code=mountbaker, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KIOWA, code=mountbaker, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KIOWA, code=S5_CRISTAL, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KIOWA, code=S5_CRISTAL, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S5_CRISTAL = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KIOWA, code=X4_CRISTAL, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KIOWA, code=X4_CRISTAL, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val X4_CRISTAL = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KIOWA, code=zhongshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KIOWA, code=zhongshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
