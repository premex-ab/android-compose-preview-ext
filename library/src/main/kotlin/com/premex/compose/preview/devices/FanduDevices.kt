package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FandU device specifications for Android Compose previews.
 *
 * This extension provides FandU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fandu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fandu: Any
  get() = object {
      /** FandU marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** FandU nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** FandU tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** FandU yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
