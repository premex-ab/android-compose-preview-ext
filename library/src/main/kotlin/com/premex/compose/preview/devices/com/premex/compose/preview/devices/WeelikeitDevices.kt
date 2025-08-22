package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * weelikeit device specifications for Android Compose previews.
 *
 * This extension provides weelikeit device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Weelikeit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Weelikeit: Any
  get() = object {
      /** DeviceSpec(manufacturer=weelikeit, code=C19W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=C19W, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val C19W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=weelikeit, code=C19W_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=C19W_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val C19W_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=weelikeit, code=C28, width=600, height=1024, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=C28, width=600,
      height=1024, dpi=200, isGoogleDevice=false).code */
      val C28 = "spec:width=600,height=1024,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=weelikeit, code=C72W, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=C72W, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val C72W = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=weelikeit, code=C72W_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=C72W_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val C72W_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=weelikeit, code=C76W, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=C76W, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val C76W = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=weelikeit, code=C76W_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=C76W_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val C76W_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=weelikeit, code=C81W, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=C81W, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C81W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=weelikeit, code=C81W_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=C81W_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val C81W_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=weelikeit, code=C85W, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=C85W, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C85W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=weelikeit, code=C85W_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=C85W_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val C85W_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=weelikeit, code=F11W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=F11W, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F11W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=weelikeit, code=F83W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=F83W, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F83W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=weelikeit, code=P11W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=P11W, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P11W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=weelikeit, code=P11W_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=P11W_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val P11W_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=weelikeit, code=P16W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=P16W, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P16W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=weelikeit, code=P16W_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=P16W_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val P16W_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=weelikeit, code=P16-W, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=P16-W, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val P16_W = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=weelikeit, code=P36W, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=P36W, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val P36W = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=weelikeit, code=P36W_EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=P36W_EEA,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val P36W_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=weelikeit, code=P39W, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=P39W, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val P39W = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=weelikeit, code=P39W_EEA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=P39W_EEA,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val P39W_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=weelikeit, code=P51L_EEA, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=weelikeit, code=P51L_EEA,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val P51L_EEA = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
