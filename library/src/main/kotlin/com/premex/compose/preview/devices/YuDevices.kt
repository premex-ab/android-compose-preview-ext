package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YU device specifications for Android Compose previews.
 *
 * This extension provides YU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yu: Any
  get() = object {
      /** YU YU4711 */
      val YU4711 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** YU YU5011 */
      val YU5011 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** YU YU5012 */
      val YU5012 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** YU YU5014 */
      val YU5014 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** YU YU5040 */
      val YU5040 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** YU YU6000 */
      val YU6000 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** YU YUNICORN */
      val YUNICORN = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** YU YUPHORIA */
      val YUPHORIA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** YU YUREKA */
      val YUREKA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** YU YUREKA2 */
      val YUREKA2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** YU YUREKAS */
      val YUREKAS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** YU YUTOPIA */
      val YUTOPIA = "spec:width=1440,height=2560,unit=px,dpi=640"

  }
