package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Qilive device specifications for Android Compose previews.
 *
 * This extension provides Qilive device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qilive.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qilive: Any
  get() = object {
      /** DeviceSpec(manufacturer=Qilive, code=guandu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=guandu, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Qilive, code=marina, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=marina, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Qilive, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=martin, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Qilive, code=nagata, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=nagata, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Qilive, code=Q10S55IN4G2, width=640, height=1280, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=Q10S55IN4G2,
      width=640, height=1280, dpi=260, isGoogleDevice=false).code */
      val Q10S55IN4G2 = "spec:width=640,height=1280,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Qilive, code=Q10T10INP, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=Q10T10INP, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Q10T10INP = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Qilive, code=Q8S55IN4G2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=Q8S55IN4G2,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val Q8S55IN4G2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Qilive, code=Q8S5IN4GP, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=Q8S5IN4GP, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Q8S5IN4GP = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Qilive, code=Q8S6IN4G, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=Q8S6IN4G, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Q8S6IN4G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Qilive, code=Q9S5IN4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=Q9S5IN4G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q9S5IN4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Qilive, code=QT19101HV, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=QT19101HV, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val QT19101HV = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Qilive, code=QT19101K_116_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=QT19101K_116_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val QT19101K_116_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Qilive, code=QT21101L_232_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=QT21101L_232_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val QT21101L_232_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Qilive, code=QT21101_464_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=QT21101_464_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val QT21101_464_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Qilive, code=QT2110BP, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=QT2110BP, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val QT2110BP = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Qilive, code=QT23126BP, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=QT23126BP, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val QT23126BP = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Qilive, code=tamachi, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=tamachi, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Qilive, code=yeongdeungpo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qilive, code=yeongdeungpo,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
