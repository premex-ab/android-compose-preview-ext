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
      /** Qilive guandu */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Qilive marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Qilive martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Qilive nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Qilive Q10S55IN4G2 */
      val Q10S55IN4G2 = "spec:width=640,height=1280,unit=px,dpi=260"

      /** Qilive Q10T10INP */
      val Q10T10INP = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Qilive Q8S55IN4G2 */
      val Q8S55IN4G2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Qilive Q8S5IN4GP */
      val Q8S5IN4GP = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Qilive Q8S6IN4G */
      val Q8S6IN4G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Qilive Q9S5IN4G */
      val Q9S5IN4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Qilive QT19101HV */
      val QT19101HV = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** Qilive QT19101K_116_EEA */
      val QT19101K_116_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Qilive QT21101L_232_EEA */
      val QT21101L_232_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Qilive QT21101_464_EEA */
      val QT21101_464_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Qilive QT2110BP */
      val QT2110BP = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Qilive QT23126BP */
      val QT23126BP = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** Qilive tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Qilive yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
