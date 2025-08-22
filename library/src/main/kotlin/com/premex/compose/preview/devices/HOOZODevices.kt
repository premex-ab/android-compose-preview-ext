package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HOOZO device specifications for Android Compose previews.
 *
 * This extension provides HOOZO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HOOZO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HOOZO: Any
  get() = object {
      /** HOOZO F13 */
      val F13 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HOOZO F13_EEA */
      val F13_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HOOZO HZ0010 */
      val HZ0010 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** HOOZO HZ0010J */
      val HZ0010J = "spec:width=800,height=1280,unit=px,dpi=240"

      /** HOOZO HZ0011 */
      val HZ0011 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** HOOZO HZ1012 */
      val HZ1012 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HOOZO KTLA133 */
      val KTLA133 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HOOZO MA768 */
      val MA768 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HOOZO MBR05 */
      val MBR05 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HOOZO MBR05_EEA */
      val MBR05_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HOOZO MID */
      val MID = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HOOZO MZ10863W */
      val MZ10863W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOOZO MZS10 */
      val MZS10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** HOOZO YK_P30 */
      val YK_P30 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HOOZO YK_P30_EEA */
      val YK_P30_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
