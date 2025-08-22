package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * zte device specifications for Android Compose previews.
 *
 * This extension provides zte device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zte.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zte: Any
  get() = object {
      /** DeviceSpec(manufacturer=zte, code=achill, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=zte, code=achill, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ACHILL = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=zte, code=cygni, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=zte, code=cygni, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CYGNI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=zte, code=cynthia, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=zte, code=cynthia, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CYNTHIA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=zte, code=demi, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=zte, code=demi, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val DEMI = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=zte, code=draconis, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=zte, code=draconis, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DRACONIS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=zte, code=hera, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=zte, code=hera, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val HERA = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=zte, code=K97, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=zte, code=K97, width=768,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K97 = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=zte, code=leo, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=zte, code=leo, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LEO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=zte, code=lily, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=zte, code=lily, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val LILY = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=zte, code=msm8974, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=zte, code=msm8974, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MSM8974 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=zte, code=nancy, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=zte, code=nancy, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NANCY = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=zte, code=platy, width=400, height=400, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=zte, code=platy, width=400,
      height=400, dpi=280, isGoogleDevice=false).code */
      val PLATY = "spec:width=400,height=400,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=zte, code=tom, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=zte, code=tom, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TOM = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=zte, code=warp6, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=zte, code=warp6, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val WARP6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=zte, code=Z2339, width=480, height=800, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=zte, code=Z2339, width=480,
      height=800, dpi=220, isGoogleDevice=false).code */
      val Z2339 = "spec:width=480,height=800,unit=px,dpi=220"

  }
