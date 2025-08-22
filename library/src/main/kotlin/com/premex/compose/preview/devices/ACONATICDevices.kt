package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ACONATIC device specifications for Android Compose previews.
 *
 * This extension provides ACONATIC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ACONATIC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ACONATIC: Any
  get() = object {
      /** ACONATIC barking */
      val BARKING = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ACONATIC bruno */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ACONATIC R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ACONATIC R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ACONATIC R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ACONATIC R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ACONATIC shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ACONATIC stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ACONATIC zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
