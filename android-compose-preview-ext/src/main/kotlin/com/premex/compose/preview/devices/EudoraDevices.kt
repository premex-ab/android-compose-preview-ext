package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Eudora device specifications for Android Compose previews.
 *
 * This extension provides Eudora device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Eudora.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Eudora: Any
  get() = object {
      /** Eudora E10Pro */
      val E10PRO = "spec:width=800,height=1280,unit=px,dpi=190"

      /** Eudora E62Plus */
      val E62PLUS = "spec:width=480,height=1014,unit=px,dpi=213"

      /** Eudora E65Pro */
      val E65PRO = "spec:width=720,height=1600,unit=px,dpi=280"

  }
