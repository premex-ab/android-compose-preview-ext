package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DeutscheTelekom device specifications for Android Compose previews.
 *
 * This extension provides DeutscheTelekom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Deutschetelekom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Deutschetelekom: Any
  get() = object {
      /** DeutscheTelekom CHEETAH */
      val CHEETAH = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeutscheTelekom Hubbs */
      val HUBBS = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeutscheTelekom Jaguar */
      val JAGUAR = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeutscheTelekom Leopard */
      val LEOPARD = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeutscheTelekom Lion */
      val LION = "spec:width=720,height=1640,unit=px,dpi=280"

      /** DeutscheTelekom PUMA */
      val PUMA = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeutscheTelekom Tiger */
      val TIGER = "spec:width=720,height=1640,unit=px,dpi=280"

  }
