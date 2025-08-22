package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LIFEPHONE device specifications for Android Compose previews.
 *
 * This extension provides LIFEPHONE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LIFEPHONE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LIFEPHONE: Any
  get() = object {
      /** DeviceSpec(manufacturer=LIFEPHONE, code=LIFEPHONE_HERO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LIFEPHONE, code=LIFEPHONE_HERO,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val LIFEPHONE_HERO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LIFEPHONE, code=LIFEPHONE_IDOL, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LIFEPHONE, code=LIFEPHONE_IDOL,
      width=720, height=1600, dpi=480, isGoogleDevice=false).code */
      val LIFEPHONE_IDOL = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LIFEPHONE, code=LIFEPHONE_STAR, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LIFEPHONE, code=LIFEPHONE_STAR,
      width=720, height=1600, dpi=480, isGoogleDevice=false).code */
      val LIFEPHONE_STAR = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LIFEPHONE, code=LIFEPHONE_VISION, width=1080, height=2400,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LIFEPHONE,
      code=LIFEPHONE_VISION, width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val LIFEPHONE_VISION = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
