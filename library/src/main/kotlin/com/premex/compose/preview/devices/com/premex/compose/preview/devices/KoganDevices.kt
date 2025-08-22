package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kogan device specifications for Android Compose previews.
 *
 * This extension provides Kogan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kogan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kogan: Any
  get() = object {
      /** DeviceSpec(manufacturer=Kogan, code=Agora_Go, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=Agora_Go, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val AGORA_GO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kogan, code=AGORA_XI, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=AGORA_XI, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val AGORA_XI = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kogan, code=cottongreen, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=cottongreen,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val COTTONGREEN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kogan, code=hanyang, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=hanyang, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HANYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kogan, code=ikebukuro, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=ikebukuro, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Kogan, code=KAKT10164SA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=KAKT10164SA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val KAKT10164SA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Kogan, code=KATB10128WPA, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=KATB10128WPA,
      width=1200, height=1920, dpi=213, isGoogleDevice=false).code */
      val KATB10128WPA = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Kogan, code=KATB1064CGRY, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=KATB1064CGRY,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val KATB1064CGRY = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Kogan, code=KATB1064WGRY, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=KATB1064WGRY,
      width=1200, height=1920, dpi=213, isGoogleDevice=false).code */
      val KATB1064WGRY = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Kogan, code=KATB21064CPA, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=KATB21064CPA,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val KATB21064CPA = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Kogan, code=KATB2P1064WPA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=KATB2P1064WPA,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val KATB2P1064WPA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Kogan, code=Kogan_Agora_9, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=Kogan_Agora_9,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val KOGAN_AGORA_9 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kogan, code=Kogan_Agora_XS, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=Kogan_Agora_XS,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val KOGAN_AGORA_XS = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kogan, code=longshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=longshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kogan, code=marina, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=marina, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kogan, code=nagata, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=nagata, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Kogan, code=nippori, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=nippori, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NIPPORI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Kogan, code=redwood, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=redwood, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Kogan, code=samseong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=samseong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kogan, code=shibuya, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=shibuya, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SHIBUYA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Kogan, code=tamachi, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=tamachi, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Kogan, code=yeongdeungpo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kogan, code=yeongdeungpo,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
