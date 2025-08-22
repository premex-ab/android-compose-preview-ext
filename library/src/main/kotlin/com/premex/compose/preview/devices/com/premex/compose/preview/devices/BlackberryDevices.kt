package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * blackberry device specifications for Android Compose previews.
 *
 * This extension provides blackberry device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Blackberry.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Blackberry: Any
  get() = object {
      /** DeviceSpec(manufacturer=blackberry, code=argon, width=1440, height=2560, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackberry, code=argon, width=1440,
      height=2560, dpi=560, isGoogleDevice=false).code */
      val ARGON = "spec:width=1440,height=2560,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=blackberry, code=bbb100, width=1080, height=1620, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackberry, code=bbb100,
      width=1080, height=1620, dpi=420, isGoogleDevice=false).code */
      val BBB100 = "spec:width=1080,height=1620,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=blackberry, code=bbc100, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackberry, code=bbc100, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BBC100 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=blackberry, code=bbd100, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackberry, code=bbd100,
      width=1080, height=1920, dpi=420, isGoogleDevice=false).code */
      val BBD100 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=blackberry, code=bbe100, width=1080, height=1620, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackberry, code=bbe100,
      width=1080, height=1620, dpi=420, isGoogleDevice=false).code */
      val BBE100 = "spec:width=1080,height=1620,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=blackberry, code=bbf100, width=1080, height=1620, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackberry, code=bbf100,
      width=1080, height=1620, dpi=420, isGoogleDevice=false).code */
      val BBF100 = "spec:width=1080,height=1620,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=blackberry, code=bbg100, width=1080, height=2160, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackberry, code=bbg100,
      width=1080, height=2160, dpi=400, isGoogleDevice=false).code */
      val BBG100 = "spec:width=1080,height=2160,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=blackberry, code=bbh100, width=1080, height=2160, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackberry, code=bbh100,
      width=1080, height=2160, dpi=400, isGoogleDevice=false).code */
      val BBH100 = "spec:width=1080,height=2160,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=blackberry, code=hamburg, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackberry, code=hamburg,
      width=1080, height=1920, dpi=420, isGoogleDevice=false).code */
      val HAMBURG = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=blackberry, code=venice, width=1440, height=2560, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackberry, code=venice,
      width=1440, height=2560, dpi=560, isGoogleDevice=false).code */
      val VENICE = "spec:width=1440,height=2560,unit=px,dpi=560"

  }
