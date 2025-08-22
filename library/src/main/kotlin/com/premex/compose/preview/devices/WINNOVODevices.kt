package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WINNOVO device specifications for Android Compose previews.
 *
 * This extension provides WINNOVO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WINNOVO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WINNOVO: Any
  get() = object {
      /** WINNOVO H10 */
      val H10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** WINNOVO H10_US */
      val H10_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** WINNOVO H7 */
      val H7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** WINNOVO H7_US */
      val H7_US = "spec:width=600,height=1024,unit=px,dpi=160"

      /** WINNOVO H8 */
      val H8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** WINNOVO H8_US */
      val H8_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** WINNOVO T10LTE */
      val T10LTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** WINNOVO TS10 */
      val TS10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** WINNOVO TS10_EEA */
      val TS10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** WINNOVO TS7 */
      val TS7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** WINNOVO TS7_EEA */
      val TS7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
