package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * yyswie device specifications for Android Compose previews.
 *
 * This extension provides yyswie device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yyswie.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yyswie: Any
  get() = object {
      /** yyswie A74W */
      val A74W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** yyswie CT1001 */
      val CT1001 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** yyswie CT1001_EEA */
      val CT1001_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
