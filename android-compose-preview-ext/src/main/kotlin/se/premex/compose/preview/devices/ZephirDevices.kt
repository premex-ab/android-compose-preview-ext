package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Zephir device specifications for Android Compose previews.
 *
 * This extension provides Zephir device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zephir.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zephir: Any
  get() = object {
      /** Zephir bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Zephir komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Zephir tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Zephir yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
