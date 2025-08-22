package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MARCEL device specifications for Android Compose previews.
 *
 * This extension provides MARCEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Marcel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Marcel: Any
  get() = object {
      /** MARCEL guandu */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MARCEL martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MARCEL OrbitM20 */
      val ORBITM20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** MARCEL tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MARCEL yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
