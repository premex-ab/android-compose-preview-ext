package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HAFURY device specifications for Android Compose previews.
 *
 * This extension provides HAFURY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HAFURY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HAFURY: Any
  get() = object {
      /** DeviceSpec(manufacturer=HAFURY, code=A7, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAFURY, code=A7, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A7 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HAFURY, code=G20, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAFURY, code=G20, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val G20 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HAFURY, code=GT20, width=1080, height=2310, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAFURY, code=GT20, width=1080,
      height=2310, dpi=480, isGoogleDevice=false).code */
      val GT20 = "spec:width=1080,height=2310,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HAFURY, code=HAFURY_MIX, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAFURY, code=HAFURY_MIX, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HAFURY_MIX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HAFURY, code=HAFURY_UMAX, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAFURY, code=HAFURY_UMAX,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val HAFURY_UMAX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HAFURY, code=K30, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAFURY, code=K30, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val K30 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HAFURY, code=K30_PRO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAFURY, code=K30_PRO, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val K30_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HAFURY, code=M20, width=442, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAFURY, code=M20, width=442,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M20 = "spec:width=442,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HAFURY, code=MEET, width=1080, height=2400, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAFURY, code=MEET, width=1080,
      height=2400, dpi=400, isGoogleDevice=false).code */
      val MEET = "spec:width=1080,height=2400,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=HAFURY, code=NOTE_10, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAFURY, code=NOTE_10, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val NOTE_10 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HAFURY, code=V1, width=1080, height=2408, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAFURY, code=V1, width=1080,
      height=2408, dpi=400, isGoogleDevice=false).code */
      val V1 = "spec:width=1080,height=2408,unit=px,dpi=400"

  }
