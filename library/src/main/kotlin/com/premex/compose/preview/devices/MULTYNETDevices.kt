package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MULTYNET device specifications for Android Compose previews.
 *
 * This extension provides MULTYNET device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MULTYNET.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MULTYNET: Any
  get() = object {
      /** MULTYNET marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MULTYNET nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MULTYNET tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MULTYNET yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
