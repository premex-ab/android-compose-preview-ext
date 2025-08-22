package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AQUA device specifications for Android Compose previews.
 *
 * This extension provides AQUA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AQUA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AQUA: Any
  get() = object {
      /** DeviceSpec(manufacturer=AQUA, code=broadway, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AQUA, code=broadway, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BROADWAY = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AQUA, code=daan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AQUA, code=daan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DAAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AQUA, code=deto, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AQUA, code=deto, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DETO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AQUA, code=dupont, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AQUA, code=dupont, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DUPONT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AQUA, code=hanyang, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AQUA, code=hanyang, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HANYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AQUA, code=irvine, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AQUA, code=irvine, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val IRVINE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AQUA, code=jordan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AQUA, code=jordan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val JORDAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AQUA, code=nippori, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AQUA, code=nippori, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NIPPORI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AQUA, code=omonia, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AQUA, code=omonia, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val OMONIA = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
