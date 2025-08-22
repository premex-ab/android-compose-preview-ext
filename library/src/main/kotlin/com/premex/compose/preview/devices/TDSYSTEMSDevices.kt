package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TD_SYSTEMS device specifications for Android Compose previews.
 *
 * This extension provides TD_SYSTEMS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TDSYSTEMS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TDSYSTEMS: Any
  get() = object {
      /** TD_SYSTEMS martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** TD_SYSTEMS tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** TD_SYSTEMS yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
