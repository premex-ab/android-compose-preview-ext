package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AvidPad device specifications for Android Compose previews.
 *
 * This extension provides AvidPad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AvidPad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AvidPad: Any
  get() = object {
      /** AvidPad A30 */
      val A30 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** AvidPad A30PRO */
      val A30PRO = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** AvidPad A60 */
      val A60 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AvidPad S30 */
      val S30 = "spec:width=800,height=1340,unit=px,dpi=240"

      /** AvidPad S60 */
      val S60 = "spec:width=1200,height=2000,unit=px,dpi=284"

      /** AvidPad S80 */
      val S80 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
