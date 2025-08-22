package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GRUNKEL device specifications for Android Compose previews.
 *
 * This extension provides GRUNKEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GRUNKEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GRUNKEL: Any
  get() = object {
      /** GRUNKEL tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** GRUNKEL yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
