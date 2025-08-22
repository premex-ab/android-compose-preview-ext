package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ADOC device specifications for Android Compose previews.
 *
 * This extension provides ADOC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ADOC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ADOC: Any
  get() = object {
      /** ADOC ADOC_D18 */
      val ADOC_D18 = "spec:width=480,height=854,unit=px,dpi=160"

      /** ADOC D30 */
      val D30 = "spec:width=800,height=1280,unit=px,dpi=320"

  }
