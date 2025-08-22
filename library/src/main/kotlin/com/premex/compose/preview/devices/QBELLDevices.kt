package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QBELL device specifications for Android Compose previews.
 *
 * This extension provides QBELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QBELL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QBELL: Any
  get() = object {
      /** QBELL hanyang */
      val HANYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** QBELL mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** QBELL nippori */
      val NIPPORI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** QBELL QPHONE_10_1 */
      val QPHONE_10_1 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** QBELL QTAB10 */
      val QTAB10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** QBELL QTAB1010X_EEA */
      val QTAB1010X_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** QBELL stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** QBELL zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
