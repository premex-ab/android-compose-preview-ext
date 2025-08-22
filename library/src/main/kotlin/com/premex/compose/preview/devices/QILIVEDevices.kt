package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QILIVE device specifications for Android Compose previews.
 *
 * This extension provides QILIVE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QILIVE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QILIVE: Any
  get() = object {
      /** QILIVE Q4T10IN */
      val Q4T10IN = "spec:width=800,height=1280,unit=px,dpi=160"

      /** QILIVE Q6T10IN */
      val Q6T10IN = "spec:width=600,height=1024,unit=px,dpi=160"

      /** QILIVE Q7T10INP */
      val Q7T10INP = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** QILIVE QT19071 */
      val QT19071 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** QILIVE QT19101 */
      val QT19101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** QILIVE QT2108BP */
      val QT2108BP = "spec:width=800,height=1280,unit=px,dpi=160"

      /** QILIVE QT22101B */
      val QT22101B = "spec:width=800,height=1280,unit=px,dpi=160"

      /** QILIVE QT22103BP */
      val QT22103BP = "spec:width=800,height=1332,unit=px,dpi=200"

      /** QILIVE QT2308BK */
      val QT2308BK = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** QILIVE QT23109BP */
      val QT23109BP = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** QILIVE QT24101B */
      val QT24101B = "spec:width=800,height=1280,unit=px,dpi=200"

      /** QILIVE QT24105BP */
      val QT24105BP = "spec:width=1200,height=1920,unit=px,dpi=210"

  }
