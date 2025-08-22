package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ELEXIA device specifications for Android Compose previews.
 *
 * This extension provides ELEXIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Elexia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Elexia: Any
  get() = object {
      /** ELEXIA bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ELEXIA bruno */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ELEXIA komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

  }
